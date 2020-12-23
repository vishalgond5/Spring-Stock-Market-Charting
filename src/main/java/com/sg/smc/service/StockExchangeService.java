package com.sg.smc.service;

import java.util.List;

import com.sg.smc.dto.StockExchangeDto;

public interface StockExchangeService {
	public StockExchangeDto addStockExchange(StockExchangeDto stockExchangeDto);
	public StockExchangeDto updateStockExchange(StockExchangeDto stockExchangeDto);
	public List<StockExchangeDto> findAllStockExchanges();
	public StockExchangeDto findByStockExchangeId(long stockExchangeId);
	public StockExchangeDto deleteByStockExchangeId(long stockExchangeId);

}
