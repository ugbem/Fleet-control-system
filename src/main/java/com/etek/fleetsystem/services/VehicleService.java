package com.etek.fleetsystem.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etek.fleetsystem.models.Vehicle;
import com.etek.fleetsystem.repositories.VehicleRepository;


@Service
public class VehicleService {

	@Autowired
	private VehicleRepository vehicleRepository;
	
	//Return list of vehicles
	public List<Vehicle> getVehicles(){
		return vehicleRepository.findAll();
	}
	
	//SAve new vehicle
	public void save(Vehicle vehicle) {
		vehicleRepository.save(vehicle);
	}
	
	//get by id
	public Optional<Vehicle> findById(int id) {
		return vehicleRepository.findById(id);
	}

	public void delete(Integer id) {
		vehicleRepository.deleteById(id);
	}
	
 
}
