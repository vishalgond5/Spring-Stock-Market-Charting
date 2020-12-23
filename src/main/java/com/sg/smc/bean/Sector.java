package com.sg.smc.bean;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "sector_details", catalog = "stock_market")
public class Sector {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "sector_id")
	private long sectorId;

	@Column(name = "sector_name")
	private String sectorName;

	@Column(name = "sector_brief")
	private String sectorBrief;
	
//	@ManyToOne(fetch = FetchType.LAZY)
//	private List<Company> company;
//	private String company;

//	public List<Company> getCompany() {
//		return company;
//	}
//
//	public void setCompany(List<Company> company) {
//		this.company = company;
//	}

	public Sector() {
		super();

	}

	public Sector(String sectorName, String sectorBrief) {
		super();
		this.sectorName = sectorName;
		this.sectorBrief = sectorBrief;
	}

	public Sector(long sectorId, String sectorName, String sectorBrief) {
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
