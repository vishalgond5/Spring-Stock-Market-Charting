package com.sg.smc.dto;

public class IpoDetailDto {

	private long ipoDetailId;

	private String companyName;

	private String stockExchangeName;

	private double pricePerShare;

	private String openDateTime;

	private String ipoRemarks;

	private int totalNoOfShares;

	public IpoDetailDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IpoDetailDto(String companyName, String stockExchangeName, double pricePerShare, int totalNoOfShares, String openDateTime,
			String ipoRemarks) {
		super();
		this.companyName = companyName;
		this.stockExchangeName = stockExchangeName;
		this.pricePerShare = pricePerShare;
		this.totalNoOfShares=totalNoOfShares;
		this.openDateTime = openDateTime;
		this.ipoRemarks = ipoRemarks;
	}

	public IpoDetailDto(long ipoDetailId, String companyName, String stockExchangeName, double pricePerShare,
			int totalNoOfShares, String openDateTime, String ipoRemarks) {
		super();
		this.ipoDetailId = ipoDetailId;
		this.companyName = companyName;
		this.stockExchangeName = stockExchangeName;
		this.pricePerShare = pricePerShare;
		this.totalNoOfShares=totalNoOfShares;
		this.openDateTime = openDateTime;
		this.ipoRemarks = ipoRemarks;
	}

	public long getIpoDetailId() {
		return ipoDetailId;
	}

	public void setIpoDetailId(long ipoDetailId) {
		this.ipoDetailId = ipoDetailId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getStockExchangeName() {
		return stockExchangeName;
	}

	public void setStockExchangeName(String stockExchangeName) {
		this.stockExchangeName = stockExchangeName;
	}

	public double getPricePerShare() {
		return pricePerShare;
	}

	public void setPricePerShare(double pricePerShare) {
		this.pricePerShare = pricePerShare;
	}
	
	public int getTotalNoOfShares() {
		return totalNoOfShares;
	}

	public void setTotalNoOfShares(int totalNoOfShares) {
		this.totalNoOfShares = totalNoOfShares;
	}
	
	public String getOpenDateTime() {
		return openDateTime;
	}

	public void setOpenDateTime(String openDateTime) {
		this.openDateTime = openDateTime;
	}

	public String getIpoRemarks() {
		return ipoRemarks;
	}

	public void setIpoRemarks(String ipoRemarks) {
		this.ipoRemarks = ipoRemarks;
	}

	@Override
	public String toString() {
		return "IPODetail [ipoDetailId=" + ipoDetailId + ", companyName=" + companyName + ", stockExchangeName="
				+ stockExchangeName + ", pricePerShare=" + pricePerShare + ", totalNoOfShares=" + totalNoOfShares
				+ ", openDateTime=" + openDateTime + ", ipoRemarks=" + ipoRemarks + "]";
	}
	
}
