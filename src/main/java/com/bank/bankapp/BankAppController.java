package com.bank.bankapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bank.bankapp.bo.UserData;
import com.bank.bankapp.service.BankAppService;

@Controller
@RequestMapping("/api")
public class BankAppController {
	
	@Autowired
	BankAppService bankAppService;
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public @ResponseBody String doRegister(@RequestBody UserData user) {
		return bankAppService.doRegister(user);
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public @ResponseBody String doLogin(@RequestBody UserData user) {
		return bankAppService.doLogin(user);
	}
	
	@RequestMapping(value="/getbanklist", method=RequestMethod.GET)
	public @ResponseBody String getBankList() {
		return bankAppService.getBankList();
	}
	
	@RequestMapping(value="/getbankdata", method=RequestMethod.GET)
	public @ResponseBody String getbankdata(@RequestParam String bankName ) {
		return bankAppService.getbankdata(bankName);
	}
	
	@RequestMapping(value="/logintobank", method=RequestMethod.POST)
	public @ResponseBody String loginToBank(@RequestBody UserData user, @RequestParam String bankName) {
		return bankAppService.loginToBank(bankName, user);
	}
	
	@RequestMapping(value="/getaccounts", method=RequestMethod.GET)
	public @ResponseBody String getAccounts(@RequestParam String bankName) {
		return bankAppService.getAccounts(bankName);
	}
	
	@RequestMapping(value="/gettransactiondata", method=RequestMethod.GET)
	public @ResponseBody String getTransactionData(@RequestParam Long accnumber) {
		return bankAppService.getTransactionData(accnumber);
	}
}
