package com.hkdemircan.onetomany.repository;


import com.hkdemircan.onetomany.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
    Country findFirstById(int id);
}
