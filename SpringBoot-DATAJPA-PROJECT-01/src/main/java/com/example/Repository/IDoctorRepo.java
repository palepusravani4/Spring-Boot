package com.example.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.Entity.Doctor;

public interface IDoctorRepo extends CrudRepository<Doctor,Integer>{

}
