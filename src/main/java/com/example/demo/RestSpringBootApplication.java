package com.example.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestSpringBootApplication.class, args);

		Configuration con = new Configuration().configure().addAnnotatedClass(order.class);
		StandardServiceRegistryBuilder reg = new StandardServiceRegistryBuilder().applySettings(con.getProperties());
		SessionFactory sf = con.buildSessionFactory(reg.build());
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		order order = new order();
		order.setOrderEmail("ayush23890");
		session.save(order);
		tx.commit();
	}

}
