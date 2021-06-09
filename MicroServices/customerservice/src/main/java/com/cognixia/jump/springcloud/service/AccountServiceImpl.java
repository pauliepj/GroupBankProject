package com.cognixia.jump.springcloud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cognixia.jump.springcloud.model.Account;

@Component
public class AccountServiceImpl implements AccountService{

	@Override
	public List<Account> findByCustomer(Integer customer) {
		
		return new ArrayList<Account>();
	}

	@Override
	public Account update(Integer accountId, Account account) {
		// TODO Auto-generated method stub
		return new Account();
	}

	@Override
	public void delete(Integer accountId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Account save(Account account) {
		// TODO Auto-generated method stub
		return new Account();
	}

	
}
