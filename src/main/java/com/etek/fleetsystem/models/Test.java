package com.etek.fleetsystem.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Test {

	@Id
	private int id;
	private String name;
	private String password;


}
