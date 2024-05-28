package com.hsn.sprdtrst.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
public class Employee {
    @Id
    @SequenceGenerator(name = "employee_seq", initialValue = 1001)
    @GeneratedValue(generator = "employee_seq", strategy = GenerationType.SEQUENCE)
    private int employeeId;
    @NotEmpty
    private String employeeName;
    private String joiningDate;
    private String dob;
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.EAGER)
    @JoinColumn(name = "companyId", referencedColumnName = "companyId")
    private Company company;
}
