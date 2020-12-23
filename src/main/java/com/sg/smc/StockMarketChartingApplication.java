package com.sg.smc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class StockMarketChartingApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockMarketChartingApplication.class, args);
	}

}
