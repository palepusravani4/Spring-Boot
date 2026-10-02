package com.example.Service;

import com.example.Entity.BankAccountDetails;

public interface IBank {
	public String createAccount(BankAccountDetails bank);
	public String withdraw(int acc,double amount);
	public String deposite(int acc,double amount);

}
