package com.example.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "user")
public class Name {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long ID;

	@Column(name = "name")
	private String name;

	@Column(name = "age")
	private int age;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	@Column(name = "dob")
	private Date dob;
	
	@Column(name = "firstName")
	private String firstName;
	
	@Column(name = "lastName")
	private String lastName;
	
	@Column(name = "address_line1")
	private String address_line1;
	
	@Column(name = "address_line2")
	private String address_line2;
	
	@Column(name = "address_line3")
	private String address_line3;
	
	@Column(name = "phone")
	private long phone;
	
	

	public long getID() {
		return ID;
	}

	public void setID(long Id) {
		ID = Id;
	}

	public String getname() {
		return name;
	}

	public void setname(String Name) {
		name = Name;
	}

	public int getage() {
		return age;
	}

	public void setage(int Age) {
		age = Age;
	}
	
	public Date getdob() {
		return dob;
	}

	public void setdob(Date DOB) {
		dob = DOB;
	}
	
	public String getfirstName() {
		return firstName;
	}

	public void setfirstName(String FirstName) {
		firstName = FirstName;
	}
	
	public String getlastName() {
		return lastName;
	}

	public void setlastName(String LastName) {
		lastName = LastName;
	}
	
	public String getaddress_line1() {
		return address_line1;
	}

	public void setaddress_line1(String Address_line1) {
		address_line1 = Address_line1;
	}
	
	public String getaddress_line2() {
		return address_line2;
	}

	public void setaddress_line2(String Address_line2) {
		address_line2 = Address_line2;
	}
	
	public String getaddress_line3() {
		return address_line3;
	}

	public void setaddress_line3(String Address_line3) {
		address_line3 = Address_line3;
	}
	
	public long getphone() {
		return phone;
	}

	public void setphone(long Phone) {
		phone = Phone;
	}

	public Name() {

	}

	public Name(String Name,int Age,Date DOB, String FirstName,String LastName,String Address_line1,String Address_line2,String Address_line3,long Phone ) {
		name = Name;
		age = Age;
		dob = DOB;
		firstName = FirstName;
		lastName = LastName;
		address_line1 = Address_line1;
		address_line2 = Address_line2;
		address_line3 = Address_line3;
		phone = Phone;
	}

}


