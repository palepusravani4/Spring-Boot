package com.example.Repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.example.Document.Employee;

public interface IEmployeeRepository extends MongoRepository<Employee, String> {

    // Derived Query Methods
    List<Employee> findByEaddrIn(List<String> eaddr);

    List<Employee> findBySalaryBetween(double start, double end);

    // Custom Query with Projection
    @Query(value = "{eaddr: ?0}", fields = "{_id: 0, name: 1, eaddr: 1}")
    List<Object[]> showEmployeeDataBYAddr(String eaddr);

    // Salary Range using MongoDB operators
    @Query(value = "{salary: {$gte: ?0, $lte: ?1}}")
    List<Employee> showEmployeeBySalRange(double start, double end);

    // OR condition
    @Query("{'$or': [{'eaddr': ?0}, {'eaddr': ?1}]}")
    List<Employee> showEmpAddrOrCondition(String eaddr1, String eaddr2);
}
