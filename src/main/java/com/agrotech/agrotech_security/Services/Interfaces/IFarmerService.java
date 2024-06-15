package com.agrotech.agrotech_security.Services.Interfaces;

import com.agrotech.agrotech_security.Model.Entity.Farmer;

import java.util.List;

public interface IFarmerService {
    Farmer getById(Long id);
    Farmer getFarmerByAccountId(Long id);
    Farmer add(Long accountId, Farmer farmer);
    Farmer update(Long id, Farmer farmer);
}
