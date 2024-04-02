package com.etek.fleetsystem.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etek.fleetsystem.models.Employee;
import com.etek.fleetsystem.models.User;
import com.etek.fleetsystem.repositories.EmployeeRepository;
import com.etek.fleetsystem.repositories.UserRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private UserRepository userRepository;

	//Return list of employees
	public List<Employee> getEmployees(){
		return employeeRepository.findAll();
	}

	//SAve new employee
	public void save(Employee employee) {
		employeeRepository.save(employee);
	}

	//get by id
	public Optional<Employee> findById(int id) {
		return employeeRepository.findById(id);
	}

	public void delete(Integer id) {
		employeeRepository.deleteById(id);
	}

	//Get employees by keyword
	public List<Employee> findByKeyword(String keyword){
		return employeeRepository.findByKeyword(keyword);

	}

	//Set the Username of the employee where firstname and lastname match
	public void assignUsername(int id){
		Employee employee = employeeRepository.findById(id).orElse(null);
		User user = userRepository.findByFirstnameAndLastname(
				employee.getFirstname(),
				employee.getLastname());

		employee.setUsername(user.getUsername());
		employeeRepository.save(employee);
	}
}
