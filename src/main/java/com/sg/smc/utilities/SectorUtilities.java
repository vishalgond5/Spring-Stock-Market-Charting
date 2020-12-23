package com.sg.smc.utilities;

import java.util.ArrayList;
import java.util.List;

import com.sg.smc.bean.Sector;
import com.sg.smc.dto.SectorDto;

public class SectorUtilities {
	
public static SectorDto convertToSectorDto(Sector sector) {
		
		SectorDto sectorDto = new SectorDto();
		
		sectorDto.setSectorId(sector.getSectorId());
		sectorDto.setSectorName(sector.getSectorName());
		sectorDto.setSectorBrief(sector.getSectorBrief());
		
		return sectorDto;
		
		
	}
	
	public static Sector convertToSector(SectorDto sectorDto) {
		
		Sector sector = new Sector();
		
		sector.setSectorId(sectorDto.getSectorId());
		sector.setSectorName(sectorDto.getSectorName());
		sector.setSectorBrief(sectorDto.getSectorBrief());
		
		return sector;
		
		
	}
	
	public static List<SectorDto> convertToSectorDtoList(List<Sector> list){
		List<SectorDto> dtolist = new ArrayList<SectorDto>();
		for(Sector sector : list) 
			dtolist.add(convertToSectorDto(sector));
		return dtolist;
	}

}
