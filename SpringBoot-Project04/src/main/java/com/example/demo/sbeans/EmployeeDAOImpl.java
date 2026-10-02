package com.example.demo.sbeans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("dao")
public class EmployeeDAOImpl implements IEmployeeDAO{
	private static final String EMP_QUERY="select empno,ename,job,sal,deptno from emp where job in(?,?,?) order by job";
   private static final String INSERT_EMP="insert into emp(empno,ename,job,sal,deptno)values(empno_seq1.nextval,?,?,?,?)";
	
	@Autowired
	private DataSource ds;
    public List<Employee> getEmployeeByDesgs(String d1,String d2,String d3) throws Exception{
    List<Employee> list;
    try(Connection con=ds.getConnection();
    		PreparedStatement ps=con.prepareStatement(EMP_QUERY);){
    	ps.setString(1,d1);
    	ps.setString(2, d2);
    	ps.setString(3, d3);
         list=new ArrayList<Employee>();
    	try(ResultSet rs=ps.executeQuery()){
    		while(rs.next()) {
    			Employee emp=new Employee();
    			emp.setEno(rs.getInt(1));
    			emp.setEname(rs.getString(2));
    			emp.setJob(rs.getString(3));
    			emp.setSalary(rs.getDouble(4));
    			emp.setDeptno(rs.getInt(5));
    			
    			list.add(emp);
    			
    		}
    	}
    	
    }catch(SQLException s) {
    	s.printStackTrace();
    	throw s;
    }
    catch(Exception e) {
    	e.printStackTrace();
    	throw e;
    }
    return list;

    }
	@Override
	public int inserEmployee(Employee emp) throws Exception {
	
		int result=0;
		try(Connection con1=ds.getConnection();
			PreparedStatement ps=con1.prepareStatement(INSERT_EMP)	;){
			ps.setString(1,emp.getEname());
			ps.setString(2,emp.getJob());
			ps.setDouble(3,emp.getSalary());
			ps.setInt(4,emp.getDeptno());
			result=ps.executeUpdate();
		}
		catch(SQLException s) {
			s.printStackTrace();
			throw s;
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		return result;
	}

}
