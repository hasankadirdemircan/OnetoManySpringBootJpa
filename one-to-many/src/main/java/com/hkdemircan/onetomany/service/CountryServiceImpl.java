package com.hkdemircan.onetomany.service;

import com.hkdemircan.onetomany.model.Country;
import com.hkdemircan.onetomany.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryRepository countryRepository;
    @Override
    public Country findGetCountry(int id) {
        return countryRepository.findFirstById(id);
    }
}
