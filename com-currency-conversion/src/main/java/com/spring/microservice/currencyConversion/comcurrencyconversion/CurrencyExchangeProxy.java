package com.spring.microservice.currencyConversion.comcurrencyconversion;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



///@FeignClient(name="com-currency-conversion", url="localhost:8000")
//@FeignClient(name="currency-exchange-service")
//feign will use zuul gateway then route the request to the exchange service
@FeignClient( name="netflix-zuul-api-gateway")
@RibbonClient(name="currency-exchange-service")
public interface CurrencyExchangeProxy {

	
	//@GetMapping("/currency-exchange/from/{from}/to/{to}")
	@GetMapping("/currency-exchange-service/currency-exchange/from/{from}/to/{to}")
	public CurrencyConversion retrieveConvertedCurrency(@PathVariable("from") String from, @PathVariable("to") String to);
	
}
