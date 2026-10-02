package com.example.Service;

import com.example.Entity.BankAccount;

public interface IBankMgmtService {
	
	public String openAccount(BankAccount acc);
	public String withdraw(long accno,double amount);
	public BankAccount showAccountDetails(long accno);
	public String deposite(long accno,double amount);
	public String transferMoney(long srcAccno,long descAccno,double amount);

}
