package com.sg.smc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sg.smc.bean.StockExchange;

@Repository
public interface StockExchangeRepository extends JpaRepository<StockExchange, Long> {

}
