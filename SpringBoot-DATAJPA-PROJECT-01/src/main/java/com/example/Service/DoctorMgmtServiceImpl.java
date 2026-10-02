package com.example.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.Doctor;
import com.example.Repository.IDoctorRepo;
@Service("impl")
public class DoctorMgmtServiceImpl implements IDoctorService {
    @Autowired  
	private IDoctorRepo repo;
	@Override
	public String registerDoctor(Doctor doctor) {
		//System.out.println("doctor object before "+doctor.getId());
		Doctor doc=repo.save(doctor);
		return "Doctor object saved with id value "+doc.getId();
	}
//	@Override
//	public long showDoccount() {
//		long count = repo.count();
//		return count;
//	}
//	@Override
//	public String registerDetails(List<Doctor> doc) {
//		Iterable<Doctor> saveAll = repo.saveAll(doc);
//		List<Integer> list=StreamSupport.stream(saveAll.spliterator(), false).map(Doctor::getId).collect(Collectors.toList());
//		return list.size()+" no of doctor id save in the list "+list;
//	}
	/*@Override
	public Doctor showDoctorById(Integer id) {
		Optional<Doctor> byId = repo.findById(id);
		if(byId.isPresent()) {
			return byId.get();
		}else {
		 throw new IllegalArgumentException("Invalid Doctor id");
	}}*/
//	@Override
//	public Doctor showDoctorById(Integer id) {
//		Doctor doc=repo.findById(id).orElseThrow(()->new IllegalArgumentException("Invalid"));
//		return doc;
//	}
//	@Override
//	public Doctor showDoctorById(Integer id) {
//		Doctor doc=new Doctor();
//		doc.setSpecification("duty doctor");
//		Doctor d=repo.findById(id).orElse(doc);
//		return d;
//	}
	

}
