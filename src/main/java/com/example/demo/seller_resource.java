package com.example.demo;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class seller_resource {
	@Autowired
	seller_repo repo;

	@GetMapping("get-seller")
	public ArrayList<seller> getSeller() {
		ArrayList<seller> list = (ArrayList<seller>) repo.findAll();
		return list;
	}

	@PostMapping("signup-seller")
	public seller newSeller(@ModelAttribute seller newSeller) {
		newSeller.setSellerID();
		System.out.println(newSeller);
		repo.save(newSeller);
		return newSeller;
	}

	@PostMapping("login-seller")
	public seller loginSeller(@RequestParam String userId, @RequestParam String password) {
		seller seller = repo.findOne(userId);
		if (seller.getPassword().equals(password)) {
			return seller;
		} else {
			System.out.println("Na ji Na");
			return null;
		}
	}
}
