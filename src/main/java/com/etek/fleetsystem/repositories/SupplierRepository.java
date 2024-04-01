package com.etek.fleetsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.etek.fleetsystem.models.Supplier;


@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {

}