package com.sg.smc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sg.smc.dto.StockExchangeDto;
import com.sg.smc.service.StockExchangeService;

@RestController
@RequestMapping("/smc/stockExchange")
@CrossOrigin("*")
public class StockExchangeController {
	
	@Autowired
	private StockExchangeService stockExchangeService;
	
	@PostMapping("/add")
	public ResponseEntity<StockExchangeDto> addStockExchange(@RequestBody StockExchangeDto stockExchangeDto){
		
		return new ResponseEntity<StockExchangeDto>(stockExchangeService.addStockExchange(stockExchangeDto),HttpStatus.OK);
		
	}
	
	@PutMapping("/update")
	public ResponseEntity<StockExchangeDto> updateStockExchange(@RequestBody StockExchangeDto stockExchangeDto){
		
		return new ResponseEntity<StockExchangeDto>(stockExchangeService.addStockExchange(stockExchangeDto),HttpStatus.OK);
		
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<StockExchangeDto>> findAll(){
		
		return new ResponseEntity<List<StockExchangeDto>>(stockExchangeService.findAllStockExchanges(),HttpStatus.OK);
		
	}
	
	@GetMapping("/findById/{stockExchangeId}")
	public ResponseEntity<StockExchangeDto> findByStockExchangeId(@PathVariable("stockExchangeId") long stockExchangeId){
		
		return new ResponseEntity<StockExchangeDto>(stockExchangeService.findByStockExchangeId(stockExchangeId),HttpStatus.OK);
		
	}
	
	@DeleteMapping("/delete/{stockExchangeId}")
	public ResponseEntity<StockExchangeDto> deleteByStockExchangeId(@PathVariable("stockExchangeId") long stockExchangeId){
		
		return new ResponseEntity<StockExchangeDto>(stockExchangeService.deleteByStockExchangeId(stockExchangeId),HttpStatus.OK);
		
	}

}
