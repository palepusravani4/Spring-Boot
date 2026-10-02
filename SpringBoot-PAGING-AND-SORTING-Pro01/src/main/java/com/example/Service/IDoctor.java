package com.example.Service;






import org.springframework.data.domain.Page;

import com.example.Entity.Doctor;

public interface IDoctor {
  
	public Iterable<Doctor> showDoctorsBySorting(boolean asc,String ...props);
	public Page<Doctor> showDoctorsInfoByPageNos(int PageNo,int PageSize,boolean asc,String props);
}
