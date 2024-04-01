package com.etek.fleetsystem.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;


@Entity
public class Country {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String code;
	private String capital;
	private String description;
	private String nationality;
	private String continent;
	
	
	
	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}

 

	public Country(Integer id, String code, String capital, String description, String nationality, String continent,
			List<State> states) {
		super();
		this.id = id;
		this.code = code;
		this.capital = capital;
		this.description = description;
		this.nationality = nationality;
		this.continent = continent;
		this.states = states;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getCode() {
		return code;
	}



	public void setCode(String code) {
		this.code = code;
	}



	public String getCapital() {
		return capital;
	}



	public void setCapital(String capital) {
		this.capital = capital;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public String getNationality() {
		return nationality;
	}



	public void setNationality(String nationality) {
		this.nationality = nationality;
	}



	public String getContinent() {
		return continent;
	}



	public void setContinent(String continent) {
		this.continent = continent;
	}



	public List<State> getStates() {
		return states;
	}



	public void setStates(List<State> states) {
		this.states = states;
	}



	@OneToMany(mappedBy="country")
	private List<State> states;
}