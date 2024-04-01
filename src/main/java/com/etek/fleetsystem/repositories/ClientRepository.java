package com.etek.fleetsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.etek.fleetsystem.models.Client;


@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

}
