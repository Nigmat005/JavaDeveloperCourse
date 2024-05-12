package com.cydeo.repository;

import com.cydeo.entity.Course;
import com.cydeo.entity.Department;
import com.cydeo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Stream;

public interface CourseRepository extends JpaRepository<Course,Long> {
    //find all course by category
    // Derived
    List<Course> findByCategory(String category);

    // find all courses by category and order the entities by name
    List<Course> findByCategoryOrderByName(String category);

    //check if a course with provided name exists. Return true if course exists, else false
    boolean existsByName(String name);

    // return the count of courses for the provided category
    int countByCategory(String category);

    // find all courses that starts with the provided course name
    List<Course> findByNameStartingWith(String courseName);

    //Find all courses by category and returns a stream

    @Transactional(readOnly = true)
    Stream<Course> streamByDescriptionsIsLike(String description);


    @Transactional(readOnly = true)
    Stream<Course> streamByCategory(String category);

    //JPQL
    //Not Equal
    @Query("select e from Employee e where e.salary>=?1")
    List<Employee> getEmployeeSalaryGreater(BigDecimal salary);

    @Query("select e from Employee e where e.salary=:salary")
    List<Employee> getEmployeeViaSalary(@Param("salary") BigDecimal salary);

    @Query("Select d from Department d where d.division in :divisionList")
    List<Department> getDepartmentDivision (@Param("divisionList") List<String> divisionList);

}
