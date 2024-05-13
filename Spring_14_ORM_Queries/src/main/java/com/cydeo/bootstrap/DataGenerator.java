package com.cydeo.bootstrap;

import com.cydeo.repository.CourseRepository;
import com.cydeo.repository.DepartmentRepository;
import com.cydeo.repository.EmployeeRepository;
import com.cydeo.repository.RegionRepository;
import jakarta.persistence.Column;
import org.hibernate.collection.spi.PersistentList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

@Component
@Transactional
//@Transactional
public class DataGenerator implements CommandLineRunner {
   private final RegionRepository regionRepository;
   private final DepartmentRepository departmentRepository;
   private final EmployeeRepository employeeRepository;
   private final CourseRepository courseRepository;

    @Autowired
    public DataGenerator(RegionRepository regionRepository,DepartmentRepository departmentRepository,EmployeeRepository employeeRepository,CourseRepository courseRepository) {
        this.regionRepository = regionRepository;
        this.departmentRepository=departmentRepository;
        this.employeeRepository=employeeRepository;
        this.courseRepository=courseRepository;
    }

    @Override
    public void run(String... args) throws Exception {
//        System.out.println("---------------------REGION STARTS---------------------------");
//        System.out.println("findByCountry "+regionRepository.findByCountry("Canada"));
//        System.out.println("findDistinctByCountry "+regionRepository.findDistinctByCountry("Canada"));
//        System.out.println("findByCountryContains "+regionRepository.findByCountryContains("United"));
//        System.out.println("findByCountryContainingOrderByCountry "+regionRepository.findByCountryContainingOrderByCountry("United"));
//        System.out.println("findTop2ByCountry "+regionRepository.findTop2ByCountry("Canada"));
//        System.out.println("---------------------REGION ENDS---------------------------");

//        System.out.println("---------------------DEPARTMENT STARTS---------------------------");
//        System.out.println("findByDepartment "+departmentRepository.findByDepartment("Furniture"));
//        System.out.println("findByDivisionIsLike "+departmentRepository.findByDivisionIsLike("Health"));
//        System.out.println("findByDivisionEquals "+departmentRepository.findByDivisionEquals("Health"));
//        System.out.println("findDistinctTop3ByDivisionIsContaining "+departmentRepository.findDistinctTop3ByDivisionIsContaining("Hea"));
//        System.out.println("---------------------DEPARTMENT ENDS---------------------------");


//        System.out.println("---------------------Employee STARTS---------------------------");
//        System.out.println("findByEmail "+employeeRepository.findByEmail("amcnee1@google.es"));
//        System.out.println("findByFirstNameAndLastNameOrEmail "+employeeRepository.findByFirstNameAndLastNameOrEmail("Seline","Dubber",null));
//        System.out.println("findByFirstNameAndLastNameOrEmail "+employeeRepository.findByFirstNameAndLastNameOrEmail("","","amcnee1@google.es"));
//        System.out.println("findByFirstNameNot "+employeeRepository.findByFirstNameNot("Jodi"));
//        System.out.println("findBySalaryGreaterThan "+employeeRepository.findBySalaryGreaterThan(BigDecimal.valueOf(100000.00)));
//        System.out.println("findBySalaryIsGreaterThanEqualOrderBySalaryDesc "+employeeRepository.findBySalaryIsGreaterThanEqualOrderBySalaryDesc(BigDecimal.valueOf(90000.00)));
//        System.out.println("readByFirstName "+employeeRepository.readByFirstName("Jodi"));
//        System.out.println("---------------------Employee ENDS---------------------------");



//        System.out.println("---------------------JPQL Employee STARTS---------------------------");
//        System.out.println("getEmployeeByEmail "+employeeRepository.getEmployeeByEmail());
//        System.out.println("getEmployeeSalary "+employeeRepository.getEmployeeSalary());
//        System.out.println("getEmployeeByEmailAndSalary "+employeeRepository.getEmployeeViaEmailAndSalary("nchawkleyq@flavors.me", BigDecimal.valueOf(156303.00)));
//        System.out.println("getEmployeeByEmail "+employeeRepository.getEmployeeByEmail("nchawkleyq@flavors.me"));
//        System.out.println("---------------------JPQL Employee ENDS---------------------------");



//        System.out.println("---------------------Course Employee STARTS---------------------------");
//        System.out.println("findByCategory "+courseRepository.findByCategory("Spring"));
//        System.out.println("findByCategory "+courseRepository.findByCategoryOrderByName("Spring"));
//        System.out.println(courseRepository.existsByName("??"));
//        System.out.println("Count: "+courseRepository.countByCategory("Spring"));
//        System.out.println("findByNameStartingWith "+courseRepository.findByNameStartingWith("Getting Started with Spring Security DSL"));
//        courseRepository.streamByDescriptionsIsLike("Learn Spring Security DSL in easy steps").forEach(System.out::println);
//        courseRepository.streamByCategory("Spring").forEach(System.out::println);
        System.out.println("findAllByCategoryAnAndRatingGreaterThan: "+courseRepository.findAllByCategoryAndRatingGreaterThan("Spring","5"));
//        System.out.println("---------------------Course ENDS---------------------------");





//
//        System.out.println("---------------------JPQL Employee STARTS---------------------------");
//        System.out.println("getEmployeeSalaryGreater "+courseRepository.getEmployeeSalaryGreater(BigDecimal.valueOf(100000)));
//        System.out.println("---------------------JPQL Employee ENDS---------------------------");
//
//
//        System.out.println("---------------------JPQL Query Position Employee STARTS---------------------------");
//        System.out.println("getEmployeeViaSalary "+courseRepository.getEmployeeViaSalary(BigDecimal.valueOf(154864.00)));
//        System.out.println("getDepartmentDivision "+courseRepository.getDepartmentDivision(new ArrayList<>(Arrays.asList("Home","Electronics"))));
//        System.out.println("---------------------JPQL Query Position Employee ENDS---------------------------");




        System.out.println("---------------------JPQL Employee STARTS---------------------------");
        System.out.println("readEmployeeDetailBySalary "+employeeRepository.readEmployeeDetailBySalary(BigDecimal.valueOf(154864.00)));
        System.out.println("readEmployeeDetailBySalaryParam "+employeeRepository.readEmployeeDetailBySalaryParam(BigDecimal.valueOf(154864.00)));
        System.out.println("---------------------JPQL Employee ENDS---------------------------");


//        System.out.println("---------------------JPQL Update Employee STARTS---------------------------");
//        employeeRepository.updateEmployeeEmail(1L);
//        employeeRepository.updateEmployeeEmailNative(2L);
//        System.out.println("---------------------JPQL Update Employee ENDS---------------------------");







    }
}
