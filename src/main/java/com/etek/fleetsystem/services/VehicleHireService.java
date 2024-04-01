package com.etek.fleetsystem.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etek.fleetsystem.models.VehicleHire;
import com.etek.fleetsystem.repositories.VehicleHireRepository;


@Service
public class VehicleHireService {
	
	@Autowired
	private VehicleHireRepository vehicleHireRepository;
	
	//Return list of Vehicle Hire
	public List<VehicleHire> getVehicleHires(){
		return vehicleHireRepository.findAll();
	}
	
	//SAve new VehicleHire
	public void save(VehicleHire vehicleHire) {
		vehicleHireRepository.save(vehicleHire);
	}
	
	//get by id
	public Optional<VehicleHire> findById(int id) {
		return vehicleHireRepository.findById(id);
	}

	public void delete(Integer id) {
		vehicleHireRepository.deleteById(id);
	}


}
