package com.example.Repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.Entity.Doctor;

public interface IDoctorRepository extends PagingAndSortingRepository<Doctor, Integer>{

}
