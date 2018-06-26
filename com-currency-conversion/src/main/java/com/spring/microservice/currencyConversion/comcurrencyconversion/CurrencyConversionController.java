package com.spring.microservice.currencyConversion.comcurrencyconversion;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CurrencyConversionController {

	@Autowired
	private CurrencyExchangeProxy repo;
	
	@GetMapping("/currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversion convertCurrency(@PathVariable String from,
			@PathVariable String to, @PathVariable BigDecimal quantity)
	{
		
		Map<String,String> uriVariables=new HashMap<String,String>();
		uriVariables.put("from", from);
		uriVariables.put("to", to);
		
		
		
	ResponseEntity<CurrencyConversion>	responseEntity=new RestTemplate().getForEntity("http://localhost:8000/currency-exchange/from/{from}/to/{to}",CurrencyConversion.class, uriVariables);
	
	CurrencyConversion responsebean=responseEntity.getBody();
	
	return new CurrencyConversion(responsebean.getId(),from,to,responsebean.getCurrencyMultiplier(),quantity,quantity.multiply(responsebean.getCurrencyMultiplier()),responsebean.getPort());
	}
	
	
	@GetMapping("/currency-conversion-feign/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversion convertCurrencyFeign(@PathVariable String from,
			@PathVariable String to, @PathVariable BigDecimal quantity)
	{
		
		
		
		
	
	
	CurrencyConversion responsebean=repo.retrieveConvertedCurrency(from, to);
	
	return new CurrencyConversion(responsebean.getId(),from,to,responsebean.getCurrencyMultiplier(),quantity,quantity.multiply(responsebean.getCurrencyMultiplier()),responsebean.getPort());
	}
	
}
