package com.example.demo;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class about_resource {

	@Autowired
	about_repo repo;

	@GetMapping("/about")
	public about getAliens() {
		ArrayList<about> list = (ArrayList<about>) repo.findAll();
		about temp = repo.findOne(12341);
		System.out.println(temp);
		return temp;
	}

	@PostMapping("/about")
	public void createAbout(@RequestParam("name") String name, @RequestHeader("Authorization") String auth) {
		System.out.println(name);
		System.out.println(auth);
	}
}
