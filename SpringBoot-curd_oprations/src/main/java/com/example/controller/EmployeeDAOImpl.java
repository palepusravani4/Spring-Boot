package com.example.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.example.Model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {
	private DataSource ds;

	private String insert ="insert into Employee values(?,?,?,?)";
	private String update="update emp set name=?,department=?,salary=? where id=?";
	private String delete="delete from emp where id=?";
	private String getAll="select*from employee where id=?";
	@Override
	public void addEmployee(Employee e) throws Exception {
		Connection con=ds.getConnection();
		PreparedStatement ps=con.prepareStatement(insert);
		ps.setInt(1, e.getId());
		ps.setString(2, e.getName());
		ps.setString(3, e.getDepartment());
		ps.setDouble(4, e.getSalary());
		int rs=ps.executeUpdate();
		if(rs>0) {
			System.out.println(rs+" record inserted successfully");
		}
		else {
			System.out.println("record not inserted");
		}
		
		
		
	}

	@Override
	public Employee getEmployee(int id) throws Exception {
		Connection con=ds.getConnection();
		PreparedStatement ps=con.prepareStatement(getAll);
		ps.setInt(1,id);
		ResultSet rs=ps.executeQuery();
		Employee e=new Employee();
		if(rs.next()) {
			e.setId(rs.getInt(1));
			e.setName(rs.getString(2));
			e.setDepartment(rs.getString(3));
			e.setSalary(rs.getDouble(4));
		}
		return e;
	}

	@Override
	public List<Employee> getAllEmployees() throws Exception {
		Connection con=ds.getConnection();
		PreparedStatement ps=con.prepareStatement(getAll);
		ResultSet rs=ps.executeQuery();
		List<Employee> list=new ArrayList();
		while(rs.next()) {
		Employee e=new Employee();
	
			e.setId(rs.getInt(1));
			e.setName(rs.getString(2));
			e.setDepartment(rs.getString(3));
			e.setSalary(rs.getDouble(4));
			list.add(e);
		}
		return list;
		

	}

	@Override
	public void updateEmployee(Employee e) throws Exception {
		Connection con=ds.getConnection();
		PreparedStatement ps=con.prepareStatement(update);
		ps.setInt(1, e.getId());
		ps.setString(2, e.getName());
		ps.setString(3, e.getDepartment());
		ps.setDouble(4, e.getSalary());
		int updated=ps.executeUpdate();
		if(updated>0) {
			System.out.println(updated+"record updated successfully");
		}else {
			System.out.println("record not updated");
		}
	}

	@Override
	public void deleteEmployee(int id) throws Exception {
		Connection con=ds.getConnection();
		PreparedStatement ps=con.prepareStatement(delete);
		ps.setInt(1,id);
		int delete =ps.executeUpdate();
		if(delete>0) {
			System.out.println(delete+"record deleted successfully");
		}else {
			System.out.println("record not deleted");
		}
	}

}
