package com.cognizant.ormlearn.entity;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "skill")
public class Skill {

    @Id
    private int id;

    private String name;

    @ManyToMany(mappedBy = "skills")
    private Set<Employee> employees;

    public Skill() {
    }

    public Skill(int id, String name) {
        this.id = id;
        this.name = name;
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

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Skill [id=" + id + ", name=" + name + "]";
    }
}