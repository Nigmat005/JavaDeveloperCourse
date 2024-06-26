package com.cydeo.bootstrap;

import com.cydeo.entity.Department;
import com.cydeo.entity.Employee;
import com.cydeo.entity.Region;
import com.cydeo.enums.Gender;
import com.cydeo.repository.DepartmentRepository;
import com.cydeo.repository.EmployeeRepository;
import com.cydeo.repository.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Component
@ConfigurationPropertiesBinding
public class DataGenerator implements CommandLineRunner {

    private final DepartmentRepository departmentRepository;
    private final EmployeeRepository employeeRepository;
    private final RegionRepository regionRepository;

    @Autowired
    public DataGenerator(DepartmentRepository departmentRepository, EmployeeRepository employeeRepository, RegionRepository regionRepository) {
        this.departmentRepository = departmentRepository;
        this.employeeRepository = employeeRepository;
        this.regionRepository = regionRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Employee e1 = new Employee("Berrie", "Manueau", "bmanueau0@dion.ne.jp", LocalDate.of(2006,04,20),154864, Gender.FEMALE);
        Employee e2 = new Employee("Aeriell", "McNee", "amcnee1@google.es", LocalDate.of(2009,01,26),56752, Gender.FEMALE);
        Employee e3 = new Employee("Sydney", "Symonds", "ssymonds2@hhs.gov", LocalDate.of(2010,05,17),95313, Gender.FEMALE);
        Employee e4 = new Employee("Avrom", "Rowantree", null, LocalDate.of(2014,03,02) ,119764,Gender.MALE);
        Employee e5 = new Employee("Feliks", "Morffew", "fmorffew4@a8.net", LocalDate.of(2003,01,14), 55307,Gender.MALE);

        List<Employee> employeeList = Arrays.asList(e1,e2,e3,e4,e5);
        employeeList.forEach(eachEmployee ->  employeeRepository.save(eachEmployee));

        Department d1 = new Department("Sports","Outdoors");
        Department d2 = new Department("Tools","Hardware");
        Department d3 = new Department("Clothing","Home");
        Department d4 = new Department("Phones & Tablets","Electronics");
        Department d5 = new Department("Computers","Electronics");

//        List<Department> departmentsList= Arrays.asList(d1,d2,d3,d4,d5);
//        departmentRepository.saveAll(departmentsList);

        // add entity department into entity Employee class
        e1.setDepartment(d1);
        e2.setDepartment(d2);
        e3.setDepartment(d3);
        e4.setDepartment(d4);
        e5.setDepartment(d5);

        employeeRepository.saveAll(employeeList);


        Region r1 = new Region("Southwest","United States");
        Region r2 = new Region("Central","United States");
        Region r3 = new Region("Northwest","United States");
        Region r4 = new Region("Quebec'","Canada");
        Region r5 = new Region("Central","Asia");

        List<Region> regionList=Arrays.asList(r1,r2,r3,r4,r5);
//        regionRepository.saveAll(regionList);

        // add entity region into entity Employee class
        e1.setRegion(r1);
        e2.setRegion(r2);
        e3.setRegion(r3);
        e4.setRegion(r4);
        e5.setRegion(r5);
        employeeRepository.saveAll(employeeList);

//        List<Department> departmentsList= Arrays.asList(d1,d2,d3,d4,d5);
//        departmentRepository.saveAll(departmentsList);



    }

}
