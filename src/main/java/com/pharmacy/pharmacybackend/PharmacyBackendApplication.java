package com.pharmacy.pharmacybackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.gcp.autoconfigure.storage.GcpStorageAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, GcpStorageAutoConfiguration.class})
public class PharmacyBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(PharmacyBackendApplication.class, args);
	}
}

@RestController
class HelloController {
	@GetMapping("/hello/{name}")
	public String hello(@PathVariable String name) {
		return "Hello, " + name + "!";
	}
}