package com.sg.smc.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="company_details",catalog="stock_market")
public class Company {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="company_id")
	private long companyId;
	
	@Column(name="company_name")
	private String companyName;
	
	@Column(name="turnover")
	private double turnover;
	
	@Column(name="ceo")
	private String ceo;
	
	@Column(name="board_of_directors")
	private String boardOfDirectors;
	
	@Column(name="stock_exchanges")
	private String stockExchanges;
	
	@Column(name="sector")
	private String sector;
	
//	@OneToMany(fetch = FetchType.LAZY)
//	private Sector sector;
	
	@Column(name="description")
	private String description;
	
	@Column(name="stock_codes")
	private long stockCodes;

	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Company(String companyName, double turnover, String ceo, String boardOfDirectors, String stockExchanges,
			String sector, String description, long stockCodes) {
		super();
		this.companyName = companyName;
		this.turnover = turnover;
		this.ceo = ceo;
		this.boardOfDirectors = boardOfDirectors;
		this.stockExchanges = stockExchanges;
		this.sector = sector;
		this.description = description;
		this.stockCodes = stockCodes;
	}

	public Company(long companyId, String companyName, double turnover, String ceo, String boardOfDirectors,
			String stockExchanges, String sector, String description, long stockCodes) {
		super();
		this.companyId = companyId;
		this.companyName = companyName;
		this.turnover = turnover;
		this.ceo = ceo;
		this.boardOfDirectors = boardOfDirectors;
		this.stockExchanges = stockExchanges;
		this.sector = sector;
		this.description = description;
		this.stockCodes = stockCodes;
	}

	public long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(long companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public double getTurnover() {
		return turnover;
	}

	public void setTurnover(double turnover) {
		this.turnover = turnover;
	}

	public String getCeo() {
		return ceo;
	}

	public void setCeo(String ceo) {
		this.ceo = ceo;
	}

	public String getBoardOfDirectors() {
		return boardOfDirectors;
	}

	public void setBoardOfDirectors(String boardOfDirectors) {
		this.boardOfDirectors = boardOfDirectors;
	}

	public String getStockExchanges() {
		return stockExchanges;
	}

	public void setStockExchanges(String stockExchanges) {
		this.stockExchanges = stockExchanges;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public long getStockCodes() {
		return stockCodes;
	}

	public void setStockCodes(long stockCodes) {
		this.stockCodes = stockCodes;
	}

	@Override
	public String toString() {
		return "Company [companyId=" + companyId + ", companyName=" + companyName + ", turnover=" + turnover + ", ceo=" + ceo
				+ ", boardOfDirectors=" + boardOfDirectors + ", stockExchanges=" + stockExchanges + ", sector=" + sector
				+ ", description=" + description + ", stockCodes=" + stockCodes + "]";
	}
	
	
	
}
