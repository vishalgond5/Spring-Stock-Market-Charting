package com.sg.smc.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sg.smc.dto.SectorDto;
import com.sg.smc.repository.SectorRepository;
import com.sg.smc.utilities.SectorUtilities;

@Service
@Transactional
public class SectorServiceImpl implements SectorService{
	
	@Autowired
	private SectorRepository sectorRepo;

	@Override
	public SectorDto addSector(SectorDto sectorDto) {
		
		return SectorUtilities.convertToSectorDto(sectorRepo.save(SectorUtilities.convertToSector(sectorDto)));
	}

	@Override
	public SectorDto updateSector(SectorDto sectorDto) {
		// TODO Auto-generated method stub
		return SectorUtilities.convertToSectorDto(sectorRepo.save(SectorUtilities.convertToSector(sectorDto)));
	}

	@Override
	public List<SectorDto> findAllSectors() {
		// TODO Auto-generated method stub
		return SectorUtilities.convertToSectorDtoList(sectorRepo.findAll());
	}

	@Override
	public SectorDto findBySectorId(long sectorId) {
		// TODO Auto-generated method stub
		return SectorUtilities.convertToSectorDto(sectorRepo.findById(sectorId).orElse(null));
	}

	@Override
	public SectorDto deleteBySectorId(long sectorId) {
		SectorDto sectorDto = findBySectorId(sectorId);
		sectorRepo.deleteById(sectorId);
		return sectorDto;
	}
}
