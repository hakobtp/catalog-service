package com.polarbookshop.catalogservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CatalogServiceApplication {

	public static void main(String[] args) {
//		http POST :9001/books author="Jon Snow" title="" isbn="123ABC456Z" price=9.90
		SpringApplication.run(CatalogServiceApplication.class, args);
	}

}
