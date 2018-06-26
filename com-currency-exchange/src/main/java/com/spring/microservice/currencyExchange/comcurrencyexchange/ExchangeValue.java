package com.spring.microservice.currencyExchange.comcurrencyexchange;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class ExchangeValue {

	@Id
	private long id;
	@Column(name="currency_from")
	private String from;
	@Column(name="currency_to")
	private String to;
	@Column(name="conversion_multiple")
	private int  currencyMultiplier;
	@Transient
	private int port;
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	//to add the defaultconstructors
	public ExchangeValue(long id, String from, String to,int currencyMultiplier) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.currencyMultiplier=currencyMultiplier;
	}
	public int getCurrencyMultiplier() {
		return currencyMultiplier;
	}
	public void setCurrencyMultiplier(int currencyMultiplier) {
		this.currencyMultiplier = currencyMultiplier;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
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
	
	
}
