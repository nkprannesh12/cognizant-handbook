package com.cognizant.ormlearn.entity;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    private int id;

    private String name;

    private double salary;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "department_id")
    private Department department;

    @ManyToMany(fetch = FetchType.EAGER, cascade = jakarta.persistence.CascadeType.ALL)
@JoinTable(
    name = "employee_skill",
    joinColumns = @JoinColumn(name = "employee_id"),
    inverseJoinColumns = @JoinColumn(name = "skill_id")
)
private Set<Skill> skills;

    public Employee() {
    }

    public Employee(int id, String name, double salary,
                    Department department, Set<Skill> skills) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.skills = skills;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Set<Skill> getSkills() {
        return skills;
    }

    public void setSkills(Set<Skill> skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id +
                ", name=" + name +
                ", salary=" + salary +
                ", department=" + department + "]";
    }
}