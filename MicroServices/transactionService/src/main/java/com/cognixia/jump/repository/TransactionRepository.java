package com.cognixia.jump.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognixia.jump.model.Transaction;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {

	List<Transaction> findAllByCustomerId(Long customerId);
	
	List<Transaction> findAllByAccountId(Long accountId);

	List<Transaction> findAllByTransactionType(String transactionType);

	List<Transaction> findByOrigin(String origin);

	Transaction findTransactionByTransactionId(Long transactionId);
}
