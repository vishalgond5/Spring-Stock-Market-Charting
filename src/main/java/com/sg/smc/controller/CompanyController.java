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

import com.sg.smc.dto.CompanyDto;
import com.sg.smc.service.CompanyService;

@RestController
@RequestMapping("/smc/company")
@CrossOrigin("*")
public class CompanyController {
	
	@Autowired
	private CompanyService companyService;
	
	@PostMapping("/add")
	public ResponseEntity<CompanyDto> addCompany(@RequestBody CompanyDto companyDto){
		
		return new ResponseEntity<CompanyDto>(companyService.addCompany(companyDto),HttpStatus.OK);
		
	}
	
	@PutMapping("/update")
	public ResponseEntity<CompanyDto> updateCompany(@RequestBody CompanyDto companyDto){
		
		return new ResponseEntity<CompanyDto>(companyService.addCompany(companyDto),HttpStatus.OK);
		
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<CompanyDto>> findAll(){
		
		return new ResponseEntity<List<CompanyDto>>(companyService.findAllCompany(),HttpStatus.OK);
		
	}
	
	@GetMapping("/find-name/{companyName}")
	public ResponseEntity<List<CompanyDto>> findByCompanyName(@PathVariable("companyName") String companyName){
		
		return new ResponseEntity<List<CompanyDto>>(companyService.findByCompanyName(companyName),HttpStatus.OK);
		
	}
	
	@GetMapping("/find-id/{companyId}")
	public ResponseEntity<CompanyDto> findById(@PathVariable("companyId") long companyId){
		
		return new ResponseEntity<CompanyDto>(companyService.findByCompanyId(companyId),HttpStatus.OK);
		
	}
	
	@DeleteMapping("/delete/{companyId}")
	public ResponseEntity<CompanyDto> deleteById(@PathVariable("companyId") long companyId){
		
		return new ResponseEntity<CompanyDto>(companyService.deleteByCompanyId(companyId),HttpStatus.OK);
		
	}
	
	
}
