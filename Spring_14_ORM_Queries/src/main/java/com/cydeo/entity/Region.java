package com.cydeo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@Entity
@Table(name = "regions")
public class Region extends BaseEntity{
    private String region;
    private String country;

//    @OneToMany(fetch = FetchType.EAGER,mappedBy = "region")
//    private Set<Employee> employeeSet;
}
