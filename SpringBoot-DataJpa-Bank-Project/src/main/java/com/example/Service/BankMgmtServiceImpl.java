package com.example.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.Entity.BankAccount;
import com.example.Repository.IBankAccountRepository;
@Service
public class BankMgmtServiceImpl implements IBankMgmtService{
    @Autowired
	private IBankAccountRepository repo;
	
	@Override
	public String openAccount(BankAccount acc) {
		acc.setCreateBy(System.getProperty("user.name"));
		long accno=repo.save(acc).getAccno();
		return "Bank account is opened having account number ::"+accno;
		
	
	}

	@Override
	public String withdraw(long accno, double amount) {
		BankAccount bank=repo.findById(accno).orElseThrow(()->new RuntimeException("Invalid Account no"));
		bank.setBalance(bank.getBalance()-amount);
		bank.setUpdateBy(System.getProperty("user.name"));
		repo.save(bank);
		return amount+" amount is withdraw from the account number ::"+accno;
	}

	@Override
	public BankAccount showAccountDetails(long accno) {
		BankAccount bank=repo.findById(accno).orElseThrow(()->new RuntimeException("Invalid Exception"));
		return bank;
	}

	@Override
	public String deposite(long accno, double amount) {
		BankAccount bank=repo.findById(accno).orElseThrow(()->new RuntimeException("Invalid Account no"));
		bank.setBalance(bank.getBalance()+amount);
		bank.setUpdateBy(System.getProperty("user.name"));
		repo.save(bank);
		return amount+" amount is deposite from the account number ::"+accno;
	
	}
    @Transactional(propagation =Propagation.NESTED)
	@Override
	public String transferMoney(long srcAccno, long descAccno, double amount) {
	        withdraw(srcAccno, amount);
	        deposite(descAccno, amount);
		return amount +" amont is transfored from "+srcAccno+"to "+descAccno;
	}

}
