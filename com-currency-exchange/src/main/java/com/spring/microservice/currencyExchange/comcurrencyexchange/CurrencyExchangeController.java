package com.spring.microservice.currencyExchange.comcurrencyexchange;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.config.environment.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {

	/*@Autowired
	private ExchangeRepository exRepo;*/
	@Autowired
	//used for getting the port
	private org.springframework.core.env.Environment env;
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retrieveConvertedCurrency(@PathVariable String from, @PathVariable String to)
	{
	   ExchangeValue  exchange =new ExchangeValue(101, "USD", "INR", 65);
	   exchange.setPort(Integer.parseInt(env.getProperty("local.server.port")));
	   return exchange;
	}
}
