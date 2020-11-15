package com.hillel.geodata.repo.impl;

import com.hillel.geodata.domain.City;
import com.hillel.geodata.domain.Country;
import com.hillel.geodata.repo.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;


@Component
public class CityRepositoryImpl implements CityRepository {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public CityRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public City getCityName(Long id) {
        return jdbcTemplate.queryForObject("select * from cities where id = ?",
                new BeanPropertyRowMapper<>(City.class), id);
    }

    @Override
    public City createCity(City city) {
        return jdbcTemplate.queryForObject("INSERT INTO\n" +
                        "    cities (name,\n" +
                        "            formation_date,\n" +
                        "            city_date,\n" +
                        "            river,\n" +
                        "            citizens_num_mln,\n" +
                        "            country_id)\n" +
                        "VALUES (?, ?, ?, ?, ?, ?)",
                new BeanPropertyRowMapper<>(City.class), city);
    }

    @Override
    public City updateCity(Long id) {
        return null;
    }

    @Override
    public City deleteCity(Long id) {
        return null;
    }





}
