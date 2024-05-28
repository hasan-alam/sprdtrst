package com.hsn.sprdtrst.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hsn.sprdtrst.entities.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Integer>{

}
