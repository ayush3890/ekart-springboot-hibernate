package com.example.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

public class order_resource {

//	@Autowired
//	order_repo repo;

	Configuration con = new Configuration().configure().addAnnotatedClass(order.class);
	StandardServiceRegistryBuilder reg = new StandardServiceRegistryBuilder().applySettings(con.getProperties());
	SessionFactory sf = con.buildSessionFactory(reg.build());
	Session session = sf.openSession();
	Transaction tx = session.beginTransaction();

	@PostMapping("create-order")
	public order newSeller(@ModelAttribute order order) {
		System.out.println("yaay");
		System.out.println(order);
		return order;
	}
}
