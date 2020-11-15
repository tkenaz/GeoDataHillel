package com.hillel.geodata.repo;

import com.hillel.geodata.domain.City;


public interface CityRepository {

    public City getCityName(Long id);

    public City createCity(City city);

    public City updateCity(Long id);

    public City deleteCity(Long id);
}
