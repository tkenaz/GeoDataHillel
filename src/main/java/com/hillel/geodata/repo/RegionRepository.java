package com.hillel.geodata.repo;

import com.hillel.geodata.domain.Region;

public interface RegionRepository {

    public Region getGovernmentName(Long id);

    public Region createGovernment(Region region);

    public Region updateGovernment(Long id);

    public Region deleteGovernment(Long id);
}
