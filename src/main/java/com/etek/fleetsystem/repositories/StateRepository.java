package com.etek.fleetsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.etek.fleetsystem.models.State;


@Repository
public interface StateRepository extends JpaRepository<State, Integer> {

}
