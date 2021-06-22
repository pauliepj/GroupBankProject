package com.cognixia.jump.springcloud.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Table(name="CUSTOMERS")
@Entity
public class Customer implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id//Pk
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="CUSTOMERID")
	Integer customerId;
	
	@Column(name="USERNAME")
	String userName;
	
	@Column(name="PASSWORD")
	String password;
	
	@Column(name="CUSTOMERNAME")
	String customerName;
	
	@Column(name="PHONE")
	String phone;
	
	@Column(name="EMAIL")
	String email;
	
	@Column(name="CITY")
	String city;
	
	

	public Customer() {
		super();
	}
	
	public Customer(String userName, String password, String customerName, String phone, String email, String city) {
		super();
		this.userName = userName;
		this.password = password;
		this.customerName = customerName;
		this.phone = phone;
		this.email = email;
		this.city = city;
	}



	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = -1;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}



}
