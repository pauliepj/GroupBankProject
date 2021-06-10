package com.cognixia.jump.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name="TRANSACTIONS")
@Entity
public class Transaction implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="TRANSACTIONID")
	Long transactionId;
	
	@Column(name="AMOUNT")
	Double amount;
	
	@Column(name="CUSTOMERID")
	Long customerId;
	
	@Column(name="ACCOUNTID")
	Long accountId;
	
	@Column(name="TRANSACTIONTYPE")
	String transactionType;
	
	@Column(name="ORIGIN")
	String origin;
	
	public Transaction() {
		super();
	}
	
	public Transaction(Long transactionId, Double amount, Long customerId, Long accountId, String transactionType,
			String origin) {
		super();
		this.transactionId = transactionId;
		this.amount = amount;
		this.customerId = customerId;
		this.customerId = accountId;
		this.transactionType = transactionType;
		this.origin = origin;
	}

	public Long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}


	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", amount=" + amount + ", customerId=" + customerId
				+ ", accountId=" + accountId + ", transactionType=" + transactionType + ", origin=" + origin + "]";
	}

	
	
}