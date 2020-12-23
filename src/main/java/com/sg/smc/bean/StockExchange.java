package com.sg.smc.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="stock_exchange_details",catalog="stock_market")
public class StockExchange {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="stock_exchange_id")
	private long stockExchangeId;
	
	@Column(name="stock_exchange_name")
	private String stockExchangeName;
	
	@Column(name="stock_exchange_brief")
	private String stockExchangeBrief;
	
	@Column(name="stock_exchange_address")
	private String stockExchangeAddress;
	
	@Column(name="stock_exchange_remarks")
	private String stockExchangeRemarks;

	public StockExchange() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StockExchange(String stockExchangeName, String stockExchangeBrief, String stockExchangeAddress,
			String stockExchangeRemarks) {
		super();
		this.stockExchangeName = stockExchangeName;
		this.stockExchangeBrief = stockExchangeBrief;
		this.stockExchangeAddress = stockExchangeAddress;
		this.stockExchangeRemarks = stockExchangeRemarks;
	}

	public StockExchange(long stockExchangeId, String stockExchangeName, String stockExchangeBrief,
			String stockExchangeAddress, String stockExchangeRemarks) {
		super();
		this.stockExchangeId = stockExchangeId;
		this.stockExchangeName = stockExchangeName;
		this.stockExchangeBrief = stockExchangeBrief;
		this.stockExchangeAddress = stockExchangeAddress;
		this.stockExchangeRemarks = stockExchangeRemarks;
	}

	public long getStockExchangeId() {
		return stockExchangeId;
	}

	public void setStockExchangeId(long stockExchangeId) {
		this.stockExchangeId = stockExchangeId;
	}

	public String getStockExchangeName() {
		return stockExchangeName;
	}

	public void setStockExchangeName(String stockExchangeName) {
		this.stockExchangeName = stockExchangeName;
	}

	public String getStockExchangeBrief() {
		return stockExchangeBrief;
	}

	public void setStockExchangeBrief(String stockExchangeBrief) {
		this.stockExchangeBrief = stockExchangeBrief;
	}

	public String getStockExchangeAddress() {
		return stockExchangeAddress;
	}

	public void setStockExchangeAddress(String stockExchangeAddress) {
		this.stockExchangeAddress = stockExchangeAddress;
	}

	public String getStockExchangeRemarks() {
		return stockExchangeRemarks;
	}

	public void setStockExchangeRemarks(String stockExchangeRemarks) {
		this.stockExchangeRemarks = stockExchangeRemarks;
	}

	@Override
	public String toString() {
		return "StockExchange [stockExchangeId=" + stockExchangeId + ", stockExchangeName=" + stockExchangeName
				+ ", stockExchangeBrief=" + stockExchangeBrief + ", stockExchangeAddress=" + stockExchangeAddress
				+ ", stockExchangeRemarks=" + stockExchangeRemarks + "]";
	}
	
	
	
}
