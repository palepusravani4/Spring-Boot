package com.example.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.BankAccountDetails;
import com.example.Repository.BankRepository;
@Service
public class BankImpl implements IBank {
	@Autowired
	BankRepository repo;

	@Override
	public String createAccount(BankAccountDetails bank) {
		bank.setCreateBy(System.getProperty("uer.name"));
	   int accno=repo.save(bank).getAccountId();
	   return "Bank account is opend with"+accno;
	}

	@Override
	public String withdraw(int acc, double amount) {
	BankAccountDetails bank=repo.findById(acc).orElseThrow(()-> new RuntimeException("Invalid account no"));
	bank.setBalance(bank.getBalance()-amount);
	bank.setUpdateBy(System.getProperty("user.name"));
	repo.save(bank);	
	return "amount is withdraw from the account no"+acc;
	}

	@Override
	public String deposite(int acc, double amount) {
		BankAccountDetails bank=repo.findById(acc).orElseThrow(()-> new RuntimeException("Invalid account no"));
		bank.setBalance(bank.getBalance()+amount);
		bank.setUpdateBy(System.getProperty("user.name"));
		repo.save(bank);	
		return "amount is deposite from the account no"+acc;
			}

}
