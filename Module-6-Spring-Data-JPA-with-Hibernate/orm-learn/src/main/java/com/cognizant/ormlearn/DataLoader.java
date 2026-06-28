package com.cognizant.ormlearn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.cognizant.ormlearn.service.CountryService;
import com.cognizant.ormlearn.service.StockService;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private CountryService countryService;

    @Autowired
private StockService stockService;

@Override
public void run(String... args) {

    System.out.println("========== TOP 3 GOOGLE STOCKS ==========");

    stockService.getTop3Stocks("GOOGL")
            .forEach(System.out::println);
}
}