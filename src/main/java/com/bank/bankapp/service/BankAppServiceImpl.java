package com.bank.bankapp.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bank.bankapp.bo.Response;
import com.bank.bankapp.bo.Transaction;
import com.bank.bankapp.bo.UserData;
import com.google.gson.Gson;

@Service
public class BankAppServiceImpl implements BankAppService{

	@Override
	public String doRegister(UserData user) {
		Response res = new Response();
		if(!user.getUserName().equalsIgnoreCase("Ankur")) 
			res.setMessage("200 ok");
		else
			res.setErrorMessage("registerd (YES)");
		Gson gson = new Gson();
		String jsonInString = gson.toJson(res);
		return jsonInString;
	}
	
	@Override
	public String doLogin(UserData user) {
		Response res = new Response();
		if(user.getUserName().equalsIgnoreCase("Ankur") && user.getPassWord().equals("1234")) 
			res.setMessage("200 ok");
		else
			res.setErrorMessage("registerd (NO)");
		Gson gson = new Gson();
		String jsonInString = gson.toJson(res);
		return jsonInString;
	}
	
	@Override
	public String getBankList() {
		Response res = new Response();
		List<String> banklist = new ArrayList<String>();
		banklist.add("HDFC");
		banklist.add("AXIS");
		res.setBanks(banklist);
		Gson gson = new Gson();
		String jsonInString = gson.toJson(res);
		return jsonInString;
	}
	
	@Override
	public String getbankdata(String bankName) {
		UserData res = new UserData();
		res.setUserName("yes");
		res.setPassWord("yes");
		res.setCorpId("yes");
		Gson gson = new Gson();
		String jsonInString = gson.toJson(res);
		return jsonInString;
	}
	
	@Override
	public String loginToBank(String bankName, UserData user) {
		Response res = new Response();
		if (bankName.equalsIgnoreCase("HDFC") && user.getUserName().equalsIgnoreCase("ankur")
				&& user.getPassWord().equals("1234") && user.getCorpId().equals("00101")) {
			res.setMessage("200 OK");
		}else {
			res.setErrorMessage("you are not authorized to log into "+ bankName);
		}
		Gson gson = new Gson();
		String jsonInString = gson.toJson(res);
		return jsonInString;
	}
	
	@Override
	public String getAccounts(String bankName) {
		UserData udata = null;
		Response res = null;
		if (bankName.equalsIgnoreCase("HDFC")) {
			udata = new UserData();
			udata.setAccountNumber(10102321456l);
			udata.setAccountType("saving");
		}else {
			res = new Response();
			res.setErrorMessage("you have not logged into "+ bankName);
		}
		Gson gson = new Gson();
		String jsonInString;
		if(udata!=null)
			jsonInString = gson.toJson(udata);
		else
			jsonInString = gson.toJson(res);
		return jsonInString;
	}
	
	@Override
	public String getTransactionData(Long accnumber) {
		Transaction transaction = new Transaction();
		transaction.setAccountNumber(accnumber);
		transaction.setAmount(1000l);
		transaction.setCreditDebit("credit");
		transaction.setTimeStamp(new Date());
	
		Gson gson = new Gson();
		return gson.toJson(transaction);
	}

}
