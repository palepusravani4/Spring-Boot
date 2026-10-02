package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.BankAccount;

public interface IBankAccountRepository extends JpaRepository<BankAccount, Long>{

}
