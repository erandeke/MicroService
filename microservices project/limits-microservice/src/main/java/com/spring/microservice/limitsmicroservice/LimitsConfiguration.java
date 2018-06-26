package com.spring.microservice.limitsmicroservice;

public class LimitsConfiguration {

	
	int min;
	int max;
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public LimitsConfiguration() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LimitsConfiguration(int min, int max) {
		super();
		this.min = min;
		this.max = max;
	}
	
	
}

