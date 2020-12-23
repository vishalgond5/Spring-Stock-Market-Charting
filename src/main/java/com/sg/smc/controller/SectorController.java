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

import com.sg.smc.dto.SectorDto;
import com.sg.smc.service.SectorService;

@RestController
@RequestMapping("/smc/sector")
@CrossOrigin("*")
public class SectorController {
	
	@Autowired
	private SectorService sectorService;
	
	@PostMapping("/add")
	public ResponseEntity<SectorDto> addSector(@RequestBody SectorDto sectorDto){
		
		return new ResponseEntity<SectorDto>(sectorService.addSector(sectorDto),HttpStatus.OK);
		
	}
	
	@PutMapping("/update")
	public ResponseEntity<SectorDto> updateSector(@RequestBody SectorDto sectorDto){
		
		return new ResponseEntity<SectorDto>(sectorService.addSector(sectorDto),HttpStatus.OK);
		
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<SectorDto>> findAll(){
		
		return new ResponseEntity<List<SectorDto>>(sectorService.findAllSectors(),HttpStatus.OK);
		
	}
	
	@GetMapping("/byId/{sectorId}")
	public ResponseEntity<SectorDto> findBySectorId(@PathVariable("sectorId") long sectorId){
		
		return new ResponseEntity<SectorDto>(sectorService.findBySectorId(sectorId),HttpStatus.OK);
		
	}
	
	@DeleteMapping("/delete/{sectorId}")
	public ResponseEntity<SectorDto> deleteBySectorId(@PathVariable("sectorId") long sectorId){
		
		return new ResponseEntity<SectorDto>(sectorService.deleteBySectorId(sectorId),HttpStatus.OK);
		
	}
}
