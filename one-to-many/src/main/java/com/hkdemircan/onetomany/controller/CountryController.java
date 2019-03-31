package com.hkdemircan.onetomany.controller;

import com.hkdemircan.onetomany.model.Country;
import com.hkdemircan.onetomany.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/country/{id}")
    public Country getCountries(@PathVariable("id") int id){
       return countryService.findGetCountry(id);
    }
}
