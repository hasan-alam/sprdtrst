package com.hsn.sprdtrst.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hsn.sprdtrst.entities.Company;
import com.hsn.sprdtrst.entities.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>{
    public List<Employee>findByCompany(Company company);

}
