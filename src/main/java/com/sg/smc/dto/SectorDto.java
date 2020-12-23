package com.sg.smc.dto;



public class SectorDto {
	
	private long sectorId;

	
	private String sectorName;

	
	private String sectorBrief;

	public SectorDto() {
		super();

	}

	public SectorDto(String sectorName, String sectorBrief) {
		super();
		this.sectorName = sectorName;
		this.sectorBrief = sectorBrief;
	}

	public SectorDto(long sectorId, String sectorName, String sectorBrief) {
		super();
		this.sectorId = sectorId;
		this.sectorName = sectorName;
		this.sectorBrief = sectorBrief;
	}

	public long getSectorId() {
		return sectorId;
	}

	public void setSectorId(long sectorId) {
		this.sectorId = sectorId;
	}

	public String getSectorName() {
		return sectorName;
	}

	public void setSectorName(String sectorName) {
		this.sectorName = sectorName;
	}

	public String getSectorBrief() {
		return sectorBrief;
	}

	public void setSectorBrief(String sectorBrief) {
		this.sectorBrief = sectorBrief;
	}

	@Override
	public String toString() {
		return "Sector [sectorId=" + sectorId + ", sectorName=" + sectorName + ", sectorBrief=" + sectorBrief + "]";
	}
}
