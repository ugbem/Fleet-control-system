package com.etek.fleetsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.etek.fleetsystem.models.VehicleHire;



@Repository
public interface VehicleHireRepository extends JpaRepository<VehicleHire, Integer> {

}
