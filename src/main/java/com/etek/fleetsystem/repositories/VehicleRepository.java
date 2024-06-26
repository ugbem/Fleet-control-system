package com.etek.fleetsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.etek.fleetsystem.models.Vehicle;


@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {

}
