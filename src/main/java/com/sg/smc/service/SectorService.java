package com.sg.smc.service;

import java.util.List;

import com.sg.smc.dto.SectorDto;

public interface SectorService {
	
	public SectorDto addSector(SectorDto sectorDto);
	public SectorDto updateSector(SectorDto sectorDto);
	public List<SectorDto> findAllSectors();
	public SectorDto deleteBySectorId(long sectorId);
	public SectorDto findBySectorId(long sectorId);

}
