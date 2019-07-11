package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

//@XmlRootElement
//@Entity
@javax.persistence.Entity
public class about {
	@Id
	private int Phone_No;
	private String Name;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public int getPhno() {
		return Phone_No;
	}

	public void setPhno(int phno) {
		this.Phone_No = phno;
	}

	@Override
	public String toString() {
		return "about [Phone_No=" + Phone_No + ", Name=" + Name + "]";
	}
}
