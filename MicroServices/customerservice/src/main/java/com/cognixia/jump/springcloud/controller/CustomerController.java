package com.cognixia.jump.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
		
		List<Account> accounts = customer.getAccounts();
		
		accounts.forEach(account -> service.save(account));
		Customer result = repository.save(customer);
		result.setAccounts(service.findByCustomer(result.getCustomerId()));
		return result;
	}
	
	@PostMapping(value="/dummycustomer")
	public Customer dummy() {
		Customer customer = new Customer("dummyUser", "password", "Jhon", "1234567890", "example@email.com", "NewYork");
		Customer result = repository.save(customer);
		result.setAccounts(service.findByCustomer(result.getCustomerId()));
		return result;
	}
	
	
	@GetMapping(value="/customer/{customerId}")
	public Customer findCustomerById(@PathVariable("customerId") Integer customerId) {
		Customer customer = repository.findByCustomerId(customerId);
		customer.setAccounts(service.findByCustomer(customer.getCustomerId()));
		return customer;
	}
}
