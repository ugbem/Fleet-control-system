package com.etek.fleetsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.etek.fleetsystem.models.VehicleModel;


@Repository
public interface VehicleModelRepository extends JpaRepository<VehicleModel, Integer> {

}
