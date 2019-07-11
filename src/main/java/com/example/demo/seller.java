package com.example.demo;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class seller {
	@Id
	public String SellerID;
	public String Name;
	public String Email;
	public String Password;
	public String PhoneNo;

	public String getSellerID() {
		return SellerID;
	}

	public void setSellerID() {
		SellerID = UUID.randomUUID().toString();
	}

//	public void setSellerID(String sellerID) {
//		SellerID = sellerID;
//	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPhoneNo() {
		return PhoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		PhoneNo = phoneNo;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	@Override
	public String toString() {
		return "seller [SellerID=" + SellerID + ", Name=" + Name + ", Email=" + Email + ", Password=" + Password
				+ ", PhoneNO=" + PhoneNo + "]";
	}

}
