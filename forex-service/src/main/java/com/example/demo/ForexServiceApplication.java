package com.example.demo;

import java.math.BigDecimal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import com.example.demo.model.ExchangeValue;
import com.example.demo.repository.ExchangeValueRepository;

@SpringBootApplication
@EnableEurekaClient
public class ForexServiceApplication implements CommandLineRunner {
	private ExchangeValueRepository exchangeValueRepository;

	public ForexServiceApplication(ExchangeValueRepository exchangeValueRepository) {
		super();
		this.exchangeValueRepository = exchangeValueRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(ForexServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		exchangeValueRepository.save(new ExchangeValue(1, "INR", "EUR", new BigDecimal(100)));
		exchangeValueRepository.save(new ExchangeValue(2, "INR", "BDT", new BigDecimal(2.8)));
		exchangeValueRepository.save(new ExchangeValue(3, "INR", "USD", new BigDecimal(85.6)));

	}

}
