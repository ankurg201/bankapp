package com.bank.bankapp.service;

import com.bank.bankapp.bo.UserData;

public interface BankAppService {
	public String doRegister(UserData user);
	
	public String doLogin(UserData user);
	
	public String getBankList();
	
	public String getbankdata(String bankName);
	
	public String loginToBank(String bankName, UserData user);
	
	public String getAccounts(String bankName);
	
	public String getTransactionData(Long accnumber);
}
