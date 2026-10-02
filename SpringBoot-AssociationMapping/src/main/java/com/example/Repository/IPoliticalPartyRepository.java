package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.PoliticalParty;

public interface IPoliticalPartyRepository extends JpaRepository<PoliticalParty, Integer> {

}
