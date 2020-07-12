package org.pract.micro.currency;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("org.pract.micro.currency")
@EnableDiscoveryClient
public class CurrencyConversionDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyConversionDemoApplication.class, args);
	}

}
