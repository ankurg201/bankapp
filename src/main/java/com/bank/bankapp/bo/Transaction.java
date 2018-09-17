package com.bank.bankapp.bo;

import java.util.Date;

public class Transaction {
	private Long accountNumber;
	private Date timeStamp;
	private Long amount;
	private String creditDebit;
	public Long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public Date getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}
	public Long getAmount() {
		return amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}
	public String getCreditDebit() {
		return creditDebit;
	}
	public void setCreditDebit(String creditDebit) {
		this.creditDebit = creditDebit;
	}
}
