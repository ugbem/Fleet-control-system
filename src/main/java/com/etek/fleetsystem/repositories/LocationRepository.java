package com.etek.fleetsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.etek.fleetsystem.models.Location;


@Repository
public interface LocationRepository extends JpaRepository<Location, Integer> {

}
