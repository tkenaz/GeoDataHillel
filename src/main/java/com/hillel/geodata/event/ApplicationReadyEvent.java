package com.hillel.geodata.event;

import com.hillel.geodata.domain.Country;
import com.hillel.geodata.domain.Region;
import com.hillel.geodata.repo.CityRepository;
import com.hillel.geodata.repo.CountryRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ApplicationReadyEvent {

    public static final Logger LOGGER = LoggerFactory.getLogger(ApplicationReadyEvent.class);
    private final CountryRepository countryRepository;

    public ApplicationReadyEvent(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void ApplicationReadyEvent() {
        LOGGER.info("------->Application is ready");
        LOGGER.info("City with id 3 = " + countryRepository.getCountryName(3L));

        LOGGER.info("Create new city = " + countryRepository.createCountry(
                new Country("UK",3L, 2L, 9, true, "01-05-1707")));


    }
}
