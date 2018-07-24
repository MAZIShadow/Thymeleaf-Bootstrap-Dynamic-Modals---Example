package com.example.dynamicModalsThymeleaf;

import com.example.dynamicModalsThymeleaf.entities.Country;
import com.example.dynamicModalsThymeleaf.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DynamicModalsThymeleafApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DynamicModalsThymeleafApplication.class, args);
	}

	@Autowired
	private CountryRepository repo;

	@Override
	public void run(String... strings) throws Exception {
		repo.save(new Country("Earth","World"));
		repo.save(new Country("China","Pekin"));
		repo.save(new Country("Germany","Berlin"));
		repo.save(new Country("USA","Washington DC"));
		repo.save(new Country("Russia","Moscow"));
		repo.save(new Country("India","New Delhi"));
	}
}
