package com.cognixia.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cognixia.model.Transaction;

@Component
public class TransactionServiceImpl implements TransactionService {

	
	public List<Transaction> findByCutomer(Integer customer) {
		List<Transaction> defaultList = new ArrayList<>();
		defaultList.add(new Transaction());
        return defaultList;
	}

	@Override
	public Transaction update(Integer transactionId, Transaction transaction) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Integer transactionId) {
		// TODO Auto-generated method stub

	}

	@Override
	public Transaction update(Transaction transaction) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Transaction> findByAccount(Integer account) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
