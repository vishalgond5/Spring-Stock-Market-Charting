package com.sg.smc.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ipo_details", catalog = "stock_market")
public class IpoDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ipo_id")
	private long ipoDetailId;

	@Column(name = "company_name")
	private String companyName;

	@Column(name = "stock_exchange_name")
	private String stockExchangeName;

	@Column(name = "price_per_share")
	private double pricePerShare;
	
	@Column(name = "total_no_of_shares")
	private int totalNoOfShares;

	@Column(name = "open_date_time")
	private String openDateTime;

	@Column(name = "ipo_remarks")
	private String ipoRemarks;

	

	public IpoDetail() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IpoDetail(String companyName, String stockExchangeName, double pricePerShare, int totalNoOfShares,
			String openDateTime, String ipoRemarks) {
		super();
		this.companyName = companyName;
		this.stockExchangeName = stockExchangeName;
		this.pricePerShare = pricePerShare;
		this.totalNoOfShares = totalNoOfShares;
		this.openDateTime = openDateTime;
		this.ipoRemarks = ipoRemarks;
	}

	public IpoDetail(long ipoDetailId, String companyName, String stockExchangeName, double pricePerShare,
			int totalNoOfShares, String openDateTime, String ipoRemarks) {
		super();
		this.ipoDetailId = ipoDetailId;
		this.companyName = companyName;
		this.stockExchangeName = stockExchangeName;
		this.pricePerShare = pricePerShare;
		this.totalNoOfShares = totalNoOfShares;
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
