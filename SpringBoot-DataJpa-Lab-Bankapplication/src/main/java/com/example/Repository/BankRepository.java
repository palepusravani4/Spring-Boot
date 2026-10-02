package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.BankAccountDetails;

public interface BankRepository extends JpaRepository<BankAccountDetails, Integer> {

}
