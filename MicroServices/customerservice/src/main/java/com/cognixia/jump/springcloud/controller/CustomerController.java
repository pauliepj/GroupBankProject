package com.cognixia.jump.springcloud.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognixia.jump.springcloud.model.Account;
import com.cognixia.jump.springcloud.model.Customer;
import com.cognixia.jump.springcloud.repository.CustomerRepository;
import com.cognixia.jump.springcloud.service.AccountService;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class CustomerController {

	@Autowired
	AccountService service;
	
	@Autowired
	CustomerRepository repository;
	
	@GetMapping("/helloThere")
	public String helloThere() {
		return "Hello There!!";
	}
	
	@PostMapping(value="/customer")
	public Customer save(@RequestBody Customer customer) {
		Customer result = repository.save(customer);
		return result;
	}
	
	@GetMapping(value="/dummycustomer")
	public List<Customer> dummy() {
		List<Customer> customerList = new ArrayList<Customer>();
		Customer customer1= new Customer("dummyUser", "password", "Jhon", "1234567890", "example@email.com", "NewYork");
		Customer customer2 = new Customer("smartUser", "password", "paul", "1234567890", "example@email.com", "Florida");
		customerList.add(customer1);
		customerList.add(customer2);
		return customerList;
	}
	@GetMapping(value="/allcustomers")
	public List<Customer> findAllCustomer() {
		return repository.findAll();
		
	}

	
	@GetMapping(value="/customer/{customerId}")
	public List<Customer> findCustomerById(@PathVariable("customerId") Integer customerId) {
		List<Customer> customer = repository.findByCustomerId(customerId);
		return customer;
	}
}
