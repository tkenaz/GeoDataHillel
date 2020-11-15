package com.hillel.geodata.domain;

import java.time.Instant;

public class City {

    private Long id;
    private String name;
    private Instant formationDate;
    private Instant cityDate;
    private boolean river;
    private double citizensNumMln;
    private Country countryId;

    public City() {
    }

    public City(String name, Instant formationDate, Instant cityDate, boolean river, double citizensNumMln, Country countryId) {
        this.name = name;
        this.formationDate = formationDate;
        this.cityDate = cityDate;
        this.river = river;
        this.citizensNumMln = citizensNumMln;
        this.countryId = countryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Instant getFormationDate() {
        return formationDate;
    }

    public void setFormationDate(Instant formationDate) {
        this.formationDate = formationDate;
    }

    public Instant getCityDate() {
        return cityDate;
    }

    public void setCityDate(Instant cityDate) {
        this.cityDate = cityDate;
    }

    public boolean isRiver() {
        return river;
    }

    public void setRiver(boolean river) {
        this.river = river;
    }

    public double getCitizensNumMln() {
        return citizensNumMln;
    }

    public void setCitizensNumMln(double citizensNumMln) {
        this.citizensNumMln = citizensNumMln;
    }

    public Long getId() {
        return id;
    }

    public Country getCountryId() {
        return countryId;
    }

    public void setCountryId(Country countryId) {
        this.countryId = countryId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof City)) return false;

        City city = (City) o;

        if (river != city.river) return false;
        if (Double.compare(city.citizensNumMln, citizensNumMln) != 0) return false;
        if (id != null ? !id.equals(city.id) : city.id != null) return false;
        if (name != null ? !name.equals(city.name) : city.name != null) return false;
        if (formationDate != null ? !formationDate.equals(city.formationDate) : city.formationDate != null)
            return false;
        if (cityDate != null ? !cityDate.equals(city.cityDate) : city.cityDate != null) return false;
        return countryId != null ? countryId.equals(city.countryId) : city.countryId == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (formationDate != null ? formationDate.hashCode() : 0);
        result = 31 * result + (cityDate != null ? cityDate.hashCode() : 0);
        result = 31 * result + (river ? 1 : 0);
        temp = Double.doubleToLongBits(citizensNumMln);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (countryId != null ? countryId.hashCode() : 0);
        return result;
    }
}
