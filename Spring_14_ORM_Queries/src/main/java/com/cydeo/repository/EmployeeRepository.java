package com.cydeo.repository;

import com.cydeo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    //Display all employees via email address
    List<Employee> findByEmail(String email);

    //Display all employee with first name ' ' and last name ' ', or show all employees with an email address
    List<Employee> findByFirstNameAndLastNameOrEmail(String firstname,String lastname,String email);

    //Display all employee that first name is not ' '
    List<Employee> findByFirstNameNot(String firstname);

    //Display all employees where last name starts with ' '
    List<Employee> findByLastNameStartsWith(String pattern);

    //Display all employee with salaries higher than ' '
    List<Employee> findBySalaryGreaterThan(BigDecimal salary);

    //Display all employee that has been hired between ' ' and ' '
    List<Employee> findByHireDateBetween(LocalDate startDate,LocalDate endDate);

    //Display all employees where salaries greater and equal to ' ' in order
    List<Employee> findBySalaryIsGreaterThanEqualOrderBySalaryDesc(BigDecimal salary);

    //Display top unique 3 employees that is making less than ' '
    List<Employee> findDistinctTop3BySalaryLessThan(Integer salary);

    //Display all employees that do not have email address
    List<Employee> findByEmailIsNull();

    // Display only firstName of Employee
    List<Employee> readByFirstName(String firstName);


    // JPQL
    @Query("select e from Employee e where e.email='nchawkleyq@flavors.me'")
    Employee getEmployeeByEmail();
    @Query("select e.salary from Employee e")
    List<BigDecimal> getEmployeeSalary();

    // JPQL Positional
    @Query("SELECT e FROM Employee e WHERE e.email=?1")
    Optional<Employee> getEmployeeByEmail(String email);

    @Query("select e from Employee e where e.email=?1 and e.salary=?2")
    Optional<Employee> getEmployeeViaEmailAndSalary(String email,BigDecimal salary);

    // SQL (Native)Query
    @Query(value = "Select * from employees where salary=?1",nativeQuery = true)
    List<Employee> readEmployeeDetailBySalary(BigDecimal salary);

    @Query(value = "Select * from employees where salary=:salary",nativeQuery = true)
    List<Employee> readEmployeeDetailBySalaryParam(@Param("salary") BigDecimal salary);

}
