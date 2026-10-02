package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.Politician;

public interface IPoliticianRepository extends JpaRepository<Politician, Integer>{

}
