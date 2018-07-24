package com.example.dynamicModalsThymeleaf.repositories;

import com.example.dynamicModalsThymeleaf.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Integer> {
}
