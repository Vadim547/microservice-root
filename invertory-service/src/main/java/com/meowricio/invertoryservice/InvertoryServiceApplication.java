package com.meowricio.invertoryservice;

import com.meowricio.invertoryservice.model.Inventory;
import com.meowricio.invertoryservice.repository.Inventoryrepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class InvertoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InvertoryServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadData(Inventoryrepository inventoryrepository) {
		return args -> {
			Inventory inventory = new Inventory();
			inventory.setSkuCode("iphone14pro");
			inventory.setQuantity(10);

			Inventory inventory1 = new Inventory();
			inventory1.setSkuCode("pixel6A");
			inventory1.setQuantity(500);

			inventoryrepository.save(inventory);
			inventoryrepository.save(inventory1);
		};
	}
}
