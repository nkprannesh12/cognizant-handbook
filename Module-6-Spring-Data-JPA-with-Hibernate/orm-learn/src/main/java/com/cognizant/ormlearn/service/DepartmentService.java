package com.cognizant.ormlearn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.ormlearn.entity.Department;
import com.cognizant.ormlearn.repository.DepartmentRepository;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    @Transactional
    public Department getDepartment(int id) {
        return departmentRepository.findById(id).orElse(null);
    }

    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }
}