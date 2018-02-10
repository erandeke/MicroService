package com.spring.microservice.limitsmicroservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

	@Autowired
	private Configuration config;
	@GetMapping("/Limits")
	public LimitsConfiguration getLimits()
	{
		return new LimitsConfiguration(config.getMinimum(),config.getMaximum());
	}
}
