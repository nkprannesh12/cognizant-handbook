package com.cognizant.ormlearn.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.ormlearn.entity.Stock;
import com.cognizant.ormlearn.repository.StockRepository;

@Service
public class StockService {

    @Autowired
    private StockRepository stockRepository;

    public List<Stock> getStocksByCode(String code) {
        return stockRepository.findByCode(code);
    }

    public List<Stock> getStocksByCodeOrderByDate(String code) {
        return stockRepository.findByCodeOrderByDateDesc(code);
    }

    public List<Stock> getStocksBetweenDates(String code,
                                             LocalDate start,
                                             LocalDate end) {
        return stockRepository.findByCodeAndDateBetween(code, start, end);
    }

    public List<Stock> getStocksGreaterThan(String code,
                                            double price) {
        return stockRepository.findByCodeAndCloseGreaterThan(code, price);
    }

    public List<Stock> getTop3Stocks(String code) {
        return stockRepository.findTop3ByCodeOrderByCloseDesc(code);
    }
}