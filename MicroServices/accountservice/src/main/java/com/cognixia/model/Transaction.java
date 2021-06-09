package com.cognixia.model;

public class Transaction {

	Long transactionId;
	
	Double amount;
	
	Long customerId;

	Long accountId;

	String transactionType;

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


	public String getBank() {
		return origin;
	}

	public void setBank(String origin) {
		this.origin = origin;
	}

	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", amount=" + amount + ", customerId=" + customerId
				+ ", accountId=" + accountId + ", transactionType=" + transactionType + ", origin=" + origin + "]";
	}
	
}
