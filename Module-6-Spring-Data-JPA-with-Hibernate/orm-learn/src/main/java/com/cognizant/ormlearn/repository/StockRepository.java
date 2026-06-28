package com.cognizant.ormlearn.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.ormlearn.entity.Stock;

public interface StockRepository extends JpaRepository<Stock, Integer> {

    List<Stock> findByCode(String code);

    List<Stock> findByCodeOrderByDateDesc(String code);

    List<Stock> findByCodeAndDateBetween(
            String code,
            LocalDate startDate,
            LocalDate endDate);

    List<Stock> findByCodeAndCloseGreaterThan(
            String code,
            double price);

    List<Stock> findTop3ByCodeOrderByCloseDesc(String code);
}