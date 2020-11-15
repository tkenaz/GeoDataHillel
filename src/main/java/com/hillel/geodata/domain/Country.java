package com.hillel.geodata.domain;

import java.time.Instant;

public class Country {
    private Long id;
    private String name;
    private Long regionId;
    private Long governmentId;
    private int regionsNum;
    private boolean seashore;
    private String formationDate;

    public Country() {
    }

    public Country(String name, Long regionId, Long governmentId, int regionsNum, boolean seashore, String formationDate) {
        this.name = name;
        this.regionId = regionId;
        this.governmentId = governmentId;
        this.regionsNum = regionsNum;
        this.seashore = seashore;
        this.formationDate = formationDate;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getRegionId() {
        return regionId;
    }

    public void setRegionId(Long regionId) {
        this.regionId = regionId;
    }

    public Long getGovernmentId() {
        return governmentId;
    }

    public void setGovernmentId(Long governmentId) {
        this.governmentId = governmentId;
    }

    public int getRegionsNum() {
        return regionsNum;
    }

    public void setRegionsNum(int regionsNum) {
        this.regionsNum = regionsNum;
    }

    public boolean isSeashore() {
        return seashore;
    }

    public void setSeashore(boolean seashore) {
        this.seashore = seashore;
    }

    public String getFormationDate() {
        return formationDate;
    }

    public void setFormationDate(String formationDate) {
        this.formationDate = formationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Country)) return false;

        Country country = (Country) o;

        if (regionsNum != country.regionsNum) return false;
        if (seashore != country.seashore) return false;
        if (id != null ? !id.equals(country.id) : country.id != null) return false;
        if (name != null ? !name.equals(country.name) : country.name != null) return false;
        if (regionId != null ? !regionId.equals(country.regionId) : country.regionId != null) return false;
        if (governmentId != null ? !governmentId.equals(country.governmentId) : country.governmentId != null)
            return false;
        return formationDate != null ? formationDate.equals(country.formationDate) : country.formationDate == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (regionId != null ? regionId.hashCode() : 0);
        result = 31 * result + (governmentId != null ? governmentId.hashCode() : 0);
        result = 31 * result + regionsNum;
        result = 31 * result + (seashore ? 1 : 0);
        result = 31 * result + (formationDate != null ? formationDate.hashCode() : 0);
        return result;
    }
}
