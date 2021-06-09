package com.cognixia.jump.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognixia.jump.model.Transaction;
import com.cognixia.jump.repository.TransactionRepository;

@RestController
public class TransactionController {

	private static final Logger logger = LoggerFactory.getLogger(TransactionController.class);
	
	@Autowired
	private TransactionRepository transactionRepository;
	
	@GetMapping("/helloThere")
	public String helloThere() {
		return "Hello There!!";
	}
	
	@GetMapping(value="/transaction/{accountId}")
	public List<Transaction> findByAccountId(@PathVariable Long accountId){
		logger.info("Find all transactions by Account Id:"+accountId);
		return transactionRepository.findAllByAccountId(accountId);
	}

	@GetMapping(value = "/transaction/{transactionId}")
	public Transaction findByTransactionId(@PathVariable Long transactionId) {
		logger.info("Find by Transaction ID :"+transactionId);
		return transactionRepository.findTransactionByTransactionId(transactionId);
	}

	@GetMapping(value = "/transaction/transaction-type/{type}")
	public List<Transaction> findByTransactionType(@PathVariable String type) {
		logger.info("Find by Transaction Type :"+type);
		return transactionRepository.findAllByTransactionType(type);
	}

	@GetMapping(value = "/transaction/origin/{origin}")
	public List<Transaction> findByOrigin(@PathVariable String origin) {
		logger.info("Find by Origin :"+origin);
		return transactionRepository.findByOrigin(origin);
	}

	@GetMapping(value = "/transaction/customer/{customer}")
	public List<Transaction> findByCustomer(@PathVariable Long customer) {
		logger.info("Find by Customer :"+customer);
		return transactionRepository.findAllByCustomerId(customer);
	}

	@PostMapping(value = "/transaction")
	public Transaction save(@RequestBody Transaction transaction) {
		return transactionRepository.save(transaction);

	}

	@GetMapping(value = "/transaction")
	public Iterable<Transaction> all() {
		logger.info("Find all transactions information ");
		return transactionRepository.findAll();
	}

	
	@PutMapping(value = "/transaction")
	public Transaction update(@RequestBody Transaction transaction) {
		logger.info("Find by Transaction :"+transaction);
		return transactionRepository.save(transaction);
	}

	@DeleteMapping(value = "/transaction")
	public void delete(@RequestBody Transaction transaction) {
		logger.info("Find by Transaction :"+transaction);
		transactionRepository.delete(transaction);
	}

}
