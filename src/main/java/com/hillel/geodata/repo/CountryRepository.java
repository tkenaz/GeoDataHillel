package com.hillel.geodata.repo;

import com.hillel.geodata.domain.Country;

public interface CountryRepository {

    Country getCountryName(Long id);

    Country createCountry(Country country);

    Country updateCountry(Long id, Country country);

    void deleteCountry(Long id);
}
