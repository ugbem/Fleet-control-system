package com.etek.fleetsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.etek.fleetsystem.models.EmployeeType;



@Repository
public interface EmployeeTypeRepository extends JpaRepository<EmployeeType, Integer> {

}
