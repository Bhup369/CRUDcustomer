package com.example.ApacheDerby.apacheDerby.Customer;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Customer {
	
	@Id
	private Integer id ;
	private String name;
	private String address;
	private int number;
	
	
	public Customer() {}
	
	
	public Customer(Integer id, String name, String address, int number) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.number = number;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	
	
	
	
	
	

}
