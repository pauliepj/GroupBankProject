package com.cognixia.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cognixia.model.Transaction;

@Service
@FeignClient(name = "transaction-service", fallback = TransactionServiceImpl.class)
public interface TransactionService {

	@GetMapping(value = "/transaction/customer/{customer}")
	List<Transaction> findByCustomer(@PathVariable("customer") Integer customer);
	
	@GetMapping(value = "/transaction/{account}")
	List<Transaction> findByAccount(@PathVariable("account") Integer account);

	@PutMapping(value = "/transaction/{transactionId}")
	Transaction update(@PathVariable("transactionId") Integer transactionId,@RequestBody Transaction transaction);

	@DeleteMapping(value = "/transaction/{transactionId}")
	void delete(@PathVariable("transactionId") Integer transactionId);

	@PostMapping(value = "/transaction")
	Transaction update(@RequestBody Transaction transaction);
}
