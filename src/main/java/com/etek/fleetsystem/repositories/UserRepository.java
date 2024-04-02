package com.etek.fleetsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.etek.fleetsystem.models.User;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	User findByUsername(String username);

	User findByFirstnameAndLastname(String firstname, String lastname);

	User findByUsernameAndPassword(String username, String password);

}
