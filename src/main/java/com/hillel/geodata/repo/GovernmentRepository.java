package com.hillel.geodata.repo;

import com.hillel.geodata.domain.Government;

public interface GovernmentRepository {

    public Government getGovernmentName(Long id);

    public Government createGovernment(Government government);

    public Government updateGovernment(Long id);

    public Government deleteGovernment(Long id);
}

