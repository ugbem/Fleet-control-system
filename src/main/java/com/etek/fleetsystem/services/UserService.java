package com.etek.fleetsystem.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.etek.fleetsystem.models.User;
import com.etek.fleetsystem.repositories.UserRepository;

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
		try {
			userRepository.save(user);
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}

	}

	public User findByUsernameAndPassword(String username, String password) {
		return userRepository.findByUsernameAndPassword(username, password);
	}

}
