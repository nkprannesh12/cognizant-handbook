package com.cognizant.ormlearn;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.cognizant.ormlearn.entity.Department;
import com.cognizant.ormlearn.entity.Employee;
import com.cognizant.ormlearn.entity.Skill;
import com.cognizant.ormlearn.service.EmployeeService;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private EmployeeService employeeService;

    @Override
public void run(String... args) {

    System.out.println("========== Average Salary ==========");

    double avgSalary = employeeService.getAverageSalary(3);

    System.out.println("Average Salary of Department 3 = " + avgSalary);
}
}