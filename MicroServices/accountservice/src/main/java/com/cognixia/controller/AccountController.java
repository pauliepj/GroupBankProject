package com.cognixia.controller;

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

import com.cognixia.model.Account;
import com.cognixia.repository.AccountRepository;
import com.cognixia.service.TransactionService;

@RestController
public class AccountController {

	
	
	private static final Logger logger = LoggerFactory.getLogger(AccountController.class);
	
	@Autowired
	private AccountRepository accountRepository;
	
    @Autowired
    TransactionService	transactionService;
	
	@GetMapping("/helloThere")
	public String helloThere() {
		return "Hello There!!";
	}
	
	@GetMapping(value = "/account")
	public Iterable<Account> all() {

		List<Account> accounts = accountRepository.findAll();

		for (Account c : accounts) {
			c.setTransaction(transactionService.findByAccount(c.getAccountId()));
		}
		logger.info("Find all accounts information ");
		return accounts;
	}


	@GetMapping(value = "/account/{accountId}")
	public Account findByAccountId(@PathVariable Integer accountId) {
		logger.info("Find by Account ID :"+accountId);
		return accountRepository.findAccountByAccountId(accountId);
	}

	@GetMapping(value = "/account/account-type/{type}")
	public List<Account> findByAccountType(@PathVariable String type) {
		logger.info("Find by Account Type :"+type);
		return accountRepository.findAllByAccountType(type);
	}

	@GetMapping(value = "/account/bank/{bank}")
	public List<Account> findByBank(@PathVariable String bank) {
		logger.info("Find by Bank :"+bank);
		return accountRepository.findByBank(bank);
	}

	@GetMapping(value = "/account/customer/{customer}")
	public List<Account> findByCustomer(@PathVariable Integer customer) {
		logger.info("Find by Customer :"+customer);
		return accountRepository.findAllByCustomerId(customer);
	}

	@PostMapping(value = "/account")
	public Account save(@RequestBody Account account) {
		return accountRepository.save(account);
	}

	
	@PutMapping(value = "/account")
	public Account update(@RequestBody Account account) {
		logger.info("Find by Account :"+account);
		return accountRepository.save(account);
	}
	
	@PostMapping(value = "/account/deposit/{accountID}/{amount}")
	public Account save(@PathVariable Integer accountID, @PathVariable Integer amount) {
		Account target = accountRepository.findAccountByAccountId(accountID);
		target.setBalance(target.getBalance() + amount);
		
		return accountRepository.save(target);
	}

	@DeleteMapping(value = "/account")
	public void delete(@RequestBody Account account) {
		logger.info("Find by Account :"+account);
		accountRepository.delete(account);
	}

}
