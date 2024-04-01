package com.etek.fleetsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.etek.fleetsystem.models.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
