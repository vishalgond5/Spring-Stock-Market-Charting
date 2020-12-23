package com.sg.smc.utilities;

import java.util.ArrayList;
import java.util.List;

import com.sg.smc.bean.StockExchange;
import com.sg.smc.dto.StockExchangeDto;

public class StockExchangeUtilities {
	
public static StockExchangeDto convertToStockExchangeDto(StockExchange stockExchange) {
		
		StockExchangeDto stockExchangeDto = new StockExchangeDto();
		
		stockExchangeDto.setStockExchangeId(stockExchange.getStockExchangeId());
		stockExchangeDto.setStockExchangeName(stockExchange.getStockExchangeName());
		stockExchangeDto.setStockExchangeBrief(stockExchange.getStockExchangeBrief());
		stockExchangeDto.setStockExchangeAddress(stockExchange.getStockExchangeAddress());
		stockExchangeDto.setStockExchangeRemarks(stockExchange.getStockExchangeRemarks());
		
		return stockExchangeDto;
		
		
	}
	
	public static StockExchange convertToStockExchange(StockExchangeDto stockExchangeDto) {
		
		StockExchange stockExchange = new StockExchange();
		
		stockExchange.setStockExchangeId(stockExchangeDto.getStockExchangeId());
		stockExchange.setStockExchangeName(stockExchangeDto.getStockExchangeName());
		stockExchange.setStockExchangeBrief(stockExchangeDto.getStockExchangeBrief());
		stockExchange.setStockExchangeAddress(stockExchangeDto.getStockExchangeAddress());
		stockExchange.setStockExchangeRemarks(stockExchangeDto.getStockExchangeRemarks());
		
		return stockExchange;
		
		
	}
	
	public static List<StockExchangeDto> convertToStockExchangeDtoList(List<StockExchange> list){
		List<StockExchangeDto> dtolist = new ArrayList<StockExchangeDto>();
		for(StockExchange stockExchange : list) 
			dtolist.add(convertToStockExchangeDto(stockExchange));
		return dtolist;
	}
}
