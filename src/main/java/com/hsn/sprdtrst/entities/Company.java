package com.hsn.sprdtrst.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
public class Company {
    @Id
    @SequenceGenerator(name = "company_seq", initialValue=1001)
    @GeneratedValue(generator = "company_seq", strategy = GenerationType.SEQUENCE)
    private int companyId;
    @NotEmpty(message = "Wrong registration number")
    private String registrationNumber;
    @NotEmpty
    private String companyName;
    private String companyAddress;
    private String businessType;
    private String website;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "company", fetch = FetchType.LAZY)
    private List<Employee> employeeList;
    
}
