package com.sg.smc.dto;

public class StockExchangeDto {

	private long stockExchangeId;

	private String stockExchangeName;

	private String stockExchangeBrief;

	private String stockExchangeAddress;

	private String stockExchangeRemarks;

	public StockExchangeDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StockExchangeDto(String stockExchangeName, String stockExchangeBrief, String stockExchangeAddress,
			String stockExchangeRemarks) {
		super();
		this.stockExchangeName = stockExchangeName;
		this.stockExchangeBrief = stockExchangeBrief;
		this.stockExchangeAddress = stockExchangeAddress;
		this.stockExchangeRemarks = stockExchangeRemarks;
	}

	public StockExchangeDto(long stockExchangeId, String stockExchangeName, String stockExchangeBrief,
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
