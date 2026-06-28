package com.cognizant.ormlearn.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.ormlearn.entity.Country;

public interface CountryRepository extends JpaRepository<Country, String> {

List<Country> findByNameContainingIgnoreCaseOrderByNameAsc(String text);

List<Country> findByNameStartingWithIgnoreCaseOrderByNameAsc(String alphabet);
}

