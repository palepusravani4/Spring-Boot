package com.example.Runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.Entity.BankAccountDetails;
import com.example.Service.IBank;

@Component
public class BankRunner implements CommandLineRunner {
	@Autowired
	IBank service;
	

	@Override
	public void run(String... args) throws Exception {
//		BankAccountDetails bank=new BankAccountDetails(25000.0);
//		String account = service.createAccount(bank);
//		System.out.println(account);
		service.deposite(1000, 5000);
		service.withdraw(1001, 5000);
	}

}
