package org.pract.micro.forex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ForexExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ForexExampleApplication.class, args);
	}

}
