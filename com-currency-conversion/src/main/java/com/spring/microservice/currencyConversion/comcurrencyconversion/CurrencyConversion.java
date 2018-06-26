package com.spring.microservice.currencyConversion.comcurrencyconversion;

import java.math.BigDecimal;

public class CurrencyConversion {

	
	private Long id;
	private String from;
	private String to;
	private BigDecimal quantity;
	private BigDecimal currencyMultiplier;
	private BigDecimal totalCalculatedAmount;
	private int port;
	
	public int getPort() {
		return port;
	}



	public void setPort(int port) {
		this.port = port;
	}



	public CurrencyConversion()
	{
		
	}
	
	
	
	public CurrencyConversion(Long id, String from, String to,
			 BigDecimal currencyMultiplier,BigDecimal quantity,
			 BigDecimal totalCalculatedAmount, int port) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.quantity = quantity;
		this.currencyMultiplier = currencyMultiplier;
		this.totalCalculatedAmount = totalCalculatedAmount;
		this.port=port;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public BigDecimal getQuantity() {
		return quantity;
	}
	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}
	public BigDecimal getCurrencyMultiplier() {
		return currencyMultiplier;
	}
	public void setCurrencyMultiplier(BigDecimal currencyMultiplier) {
		this.currencyMultiplier = currencyMultiplier;
	}
	public BigDecimal getTotalCalculatedAmount() {
		return totalCalculatedAmount;
	}
	public void setTotalCalculatedAmount(BigDecimal totalCalculatedAmount) {
		this.totalCalculatedAmount = totalCalculatedAmount;
	}
	
	
	
}
