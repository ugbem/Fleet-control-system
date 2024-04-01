package com.etek.fleetsystem.services;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.etek.fleetsystem.models.User;
import com.etek.fleetsystem.repositories.UserRepository;

import java.util.List;

@Service
public class UserService {


	//@Autowired private BCryptPasswordEncoder encoder;

	@Autowired
	private UserRepository userRepository;

	//Get All Users
	public List<User> findAll(){
		return userRepository.findAll();
	}

	//Get User By Id
	public User findById(int id) {
		return userRepository.findById(id).orElse(null);
	}

	//Delete User
	public void delete(int id) {
		userRepository.deleteById(id);
	}

	//Update User
	public void save(User user) {
		user.setPassword(user.getPassword());
		userRepository.save(user);
	}

}
