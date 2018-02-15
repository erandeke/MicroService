package com.spring.microservice.currencyExchange.comcurrencyexchange;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ComCurrencyExchangeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComCurrencyExchangeApplication.class, args);
	}
}
