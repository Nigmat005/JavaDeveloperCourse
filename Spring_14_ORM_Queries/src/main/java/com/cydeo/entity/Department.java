package com.cydeo.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@Entity
@Table(name = "departments")
public class Department {
      @Id
      private String department;
      private String division;

//      @OneToMany(fetch = FetchType.EAGER, mappedBy = "department")
//      private Set<Employee> employeeSet;
}
