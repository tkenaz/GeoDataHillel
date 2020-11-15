package com.hillel.geodata.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public String applocationName() {
        return "This is GeoData project";
    }
}
