package com.hillel.geodata.repo.impl;

import com.hillel.geodata.domain.Country;
import com.hillel.geodata.repo.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;

import java.sql.PreparedStatement;


@Component
public class CountryRepositoryImpl implements CountryRepository {

    private final JdbcTemplate jdbcTemplate;
    private final String applicationName;

    public static final String GET_COUNTRY_NAME = "SELECT * FROM countries WHERE id = ?";
    public static final String CREATE_COUNTRY_SQL = "INSERT INTO countries (name, region_id, government_id, regions_num, seashore, " +
            "formation_date) VALUES (?, ?, ?, ?, ?, ?)";
    public static final String UPDATE_COUNTRY = "UPDATE countries SET government_id = ? WHERE id = ?";
    public static final String DELETE_COUNTRY = "DELETE FROM cities WHERE id = ?";


    @Autowired
    public CountryRepositoryImpl(JdbcTemplate jdbcTemplate, String applicationName) {
        this.jdbcTemplate = jdbcTemplate;
        this.applicationName = applicationName;
    }


    @Override
    public Country getCountryName(Long id) {
        return jdbcTemplate.queryForObject(GET_COUNTRY_NAME,
                new BeanPropertyRowMapper<>(Country.class), id);
    }

    @Override
    public Country createCountry(Country country) {
        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(connection -> {
            PreparedStatement ps =
                    connection.prepareStatement(CREATE_COUNTRY_SQL, new String[]{"id"});
            ps.setString(1, "UK");
            ps.setLong(2, 3L);
            ps.setLong(3, 2L);
            ps.setInt(4, 9);
            ps.setString(5, "01-05-1707");
            return ps;
        }, keyHolder);
        Long countryId = keyHolder.getKey().longValue();
        return getCountryName(countryId);

    }

    @Override
    public Country updateCountry(Long id, Country country) {
        return jdbcTemplate.queryForObject(UPDATE_COUNTRY,
                new BeanPropertyRowMapper<>(Country.class), id, country);
    }

    @Override
    public void deleteCountry(Long id) {
        jdbcTemplate.queryForObject(DELETE_COUNTRY,
                new BeanPropertyRowMapper<>(Country.class), id);
    }
}
