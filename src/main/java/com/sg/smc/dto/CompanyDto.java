package com.sg.smc.dto;

import com.sg.smc.bean.Sector;

public class CompanyDto {
	
	
private long companyId;
	
	private String companyName;

	private double turnover;

	private String ceo;

	private String boardOfDirectors;

	private String stockExchanges;

	private String sector;

	private String description;

	private long stockCodes;

	public CompanyDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CompanyDto(String companyName, double turnover, String ceo, String boardOfDirectors, String stockExchanges,
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

	public CompanyDto(long companyId, String companyName, double turnover, String ceo, String boardOfDirectors,
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

	public void setSector(String string) {
		this.sector = string;
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
