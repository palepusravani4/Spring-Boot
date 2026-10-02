package com.example.Runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.Entity.BankAccount;
import com.example.Service.IBankMgmtService;
@Component
public class BankRuuner implements CommandLineRunner {
	@Autowired
	IBankMgmtService service;

	@Override
	public void run(String... args) throws Exception {
		
//		BankAccount bank=new BankAccount("swetha","hyd",50000.0);
//		String msg=service.openAccount(bank);
//		System.out.println(msg);
		
//		String withdraw = service.withdraw(100000, 5000.0);
//		System.out.println(withdraw);
//		String deposite=service.deposite(100001, 5000);
//		System.out.println(deposite);
		try {
		String transferMoney = service.transferMoney(100001, 100002, 5000);
		System.out.println(transferMoney);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
