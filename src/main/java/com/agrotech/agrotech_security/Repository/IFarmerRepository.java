package com.agrotech.agrotech_security.Repository;

import com.agrotech.agrotech_security.Model.Entity.Farmer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IFarmerRepository extends JpaRepository<Farmer, Long> {
    Farmer findByAccountId(Long id);
}
