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

import com.sg.smc.dto.IpoDetailDto;
import com.sg.smc.service.IpoDetailService;

@RestController
@RequestMapping("/smc/ipo")
@CrossOrigin("*")
public class IpoDetailController {
	
	@Autowired
	private IpoDetailService ipoDetailService;
	
	@PostMapping("/add")
	public ResponseEntity<IpoDetailDto> addIpoDetail(@RequestBody IpoDetailDto ipoDetailDto){
		
		return new ResponseEntity<IpoDetailDto>(ipoDetailService.addIpoDetail(ipoDetailDto),HttpStatus.OK);
		
	}
	
	@PutMapping("/update")
	public ResponseEntity<IpoDetailDto> updateIpoDetail(@RequestBody IpoDetailDto ipoDetailDto){
		
		return new ResponseEntity<IpoDetailDto>(ipoDetailService.addIpoDetail(ipoDetailDto),HttpStatus.OK);
		
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<IpoDetailDto>> findAll(){
		
		return new ResponseEntity<List<IpoDetailDto>>(ipoDetailService.findAllIpoDetails(),HttpStatus.OK);
		
	}
	
	@GetMapping("/byId/{ipoDetailId}")
	public ResponseEntity<IpoDetailDto> findByIpoDetailId(@PathVariable("ipoDetailId") long ipoDetailId){
		
		return new ResponseEntity<IpoDetailDto>(ipoDetailService.findByIpoDetailId(ipoDetailId),HttpStatus.OK);
		
	}
	
	@DeleteMapping("/delete/{ipoDetailId}")
	public ResponseEntity<IpoDetailDto> deleteByIpoDetailId(@PathVariable("ipoDetailId") long ipoDetailId){
		
		return new ResponseEntity<IpoDetailDto>(ipoDetailService.deleteByIpoDetailId(ipoDetailId),HttpStatus.OK);
		
	}


}
