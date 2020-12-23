package com.sg.smc.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sg.smc.dto.StockExchangeDto;
import com.sg.smc.repository.StockExchangeRepository;
import com.sg.smc.utilities.StockExchangeUtilities;

@Service
@Transactional
public class StockExchangeServiceImpl implements StockExchangeService {
	
	@Autowired
	private StockExchangeRepository stockExchangeRepo;
	
	@Override
	public StockExchangeDto addStockExchange(StockExchangeDto stockExchangeDto) {
		
		return StockExchangeUtilities.convertToStockExchangeDto(stockExchangeRepo.save(StockExchangeUtilities.convertToStockExchange(stockExchangeDto)));
	}

	@Override
	public StockExchangeDto updateStockExchange(StockExchangeDto stockExchangeDto) {
		// TODO Auto-generated method stub
		return StockExchangeUtilities.convertToStockExchangeDto(stockExchangeRepo.save(StockExchangeUtilities.convertToStockExchange(stockExchangeDto)));
	}

	@Override
	public List<StockExchangeDto> findAllStockExchanges() {
		// TODO Auto-generated method stub
		return StockExchangeUtilities.convertToStockExchangeDtoList(stockExchangeRepo.findAll());
	}

	@Override
	public StockExchangeDto findByStockExchangeId(long stockExchangeId) {
		// TODO Auto-generated method stub
		return StockExchangeUtilities.convertToStockExchangeDto(stockExchangeRepo.findById(stockExchangeId).orElse(null));
	}

	@Override
	public StockExchangeDto deleteByStockExchangeId(long stockExchangeId) {
		StockExchangeDto stockExchangeDto = findByStockExchangeId(stockExchangeId);
		stockExchangeRepo.deleteById(stockExchangeId);
		return stockExchangeDto;
	}

}
