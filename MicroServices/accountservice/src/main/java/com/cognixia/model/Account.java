package com.cognixia.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;


@Table(name="ACCOUNTS")
@Entity
public class Account implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id//Pk
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="ACCOUNTID")
	Integer accountId;
	
	@Column(name="BALANCE")
	Double balance;
	
	@Column(name="CUSTOMERID")
	Integer customerId;
	
	@Column(name="ACCOUNTTYPE")
	String accountType;
	
	@Column(name="BRANCHCODE")
	String branchCode;
	
	@Column(name="BANK")
	String bank;
	
	@Transient
	List<Transaction> transaction;
	
	public Account() {
		super();
	}
	
	public Account(Integer accountId, Double balance, Integer customerId, String accountType, String branchCode,
			String bank) {
		super();
		this.accountId = accountId;
		this.balance = balance;
		this.customerId = customerId;
		this.accountType = accountType;
		this.branchCode = branchCode;
		this.bank = bank;
	}

	public Integer getAccountId() {
		return accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}
	
	public List<Transaction> getTransaction() {
		return transaction;
	}

	public void setTransaction(List<Transaction> transaction) {
		this.transaction = transaction;
	}


	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", balance=" + balance + ", customerId=" + customerId
				+ ", accountType=" + accountType + ", branchCode=" + branchCode + ", bank=" + bank + "]";
	}
	
}