package com.example.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;

import com.example.Entity.Doctor;
import com.example.Repository.IDoctorRepository;
@Component
public class DoctorImpl implements IDoctor{
    @Autowired
	private IDoctorRepository repo;
	
	@Override
	public Iterable<Doctor> showDoctorsBySorting(boolean asc, String... props) {
		Sort sort=Sort.by(asc?Direction.ASC:Direction.DESC, props);
		Iterable<Doctor> it=repo.findAll(sort);
		return it;
	}

	@Override
	public Page<Doctor> showDoctorsInfoByPageNos(int PageNo, int PageSize, boolean asc, String props) {
		Sort sort=Sort.by(asc?Direction.ASC:Direction.DESC,props);
	    Pageable of = PageRequest.of(PageNo, PageSize, sort);
		Page<Doctor> p=repo.findAll(of);
		return p;
	}

}
