package com.cydeo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="departments")
@NoArgsConstructor
@Data
public class Department extends BaseEntity{

    private String department;
    private String division;

    // (mappedBy = "department") needs to be same filedName in Employee which is Department department;
    @OneToOne(mappedBy = "department")
    private Employee employee;

    public Department(String department, String division) {
        this.department = department;
        this.division = division;
    }
}
