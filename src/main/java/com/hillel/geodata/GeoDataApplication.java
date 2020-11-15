package com.hillel.geodata;

import com.hillel.geodata.repo.impl.CountryRepositoryImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@SpringBootApplication
public class GeoDataApplication {

	public static void main(String[] args) {

		SpringApplication.run(GeoDataApplication.class, args);
	}



}
