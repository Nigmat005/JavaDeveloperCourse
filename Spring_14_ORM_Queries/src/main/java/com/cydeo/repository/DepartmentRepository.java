package com.cydeo.repository;

import com.cydeo.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,String> {

    //Display all departments in the furniture department
    List<Department> findByDepartment(String department);

    //Display all Departments in the Health Division
    List<Department> findByDivisionIsLike(String division);
    List<Department> findByDivisionEquals(String division);

    //Display top 3 department with division name includes 'Hea', without duplications

    List<Department> findDistinctTop3ByDivisionIsContaining(String division );


}
