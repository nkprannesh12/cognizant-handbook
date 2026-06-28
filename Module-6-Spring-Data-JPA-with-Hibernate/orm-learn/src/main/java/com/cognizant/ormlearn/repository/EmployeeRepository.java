package com.cognizant.ormlearn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cognizant.ormlearn.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    @Query(value = "SELECT * FROM employee", nativeQuery = true)
List<Employee> getAllEmployeesNative();

@Query("SELECT AVG(e.salary) FROM Employee e WHERE e.department.id = :id")
double getAverageSalary(@Param("id") int id);

}