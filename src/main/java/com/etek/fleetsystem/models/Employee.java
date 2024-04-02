package com.etek.fleetsystem.models;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class Employee extends Person {

	@ManyToOne
	@JoinColumn(name="employeetypeid", insertable=false, updatable=false)
	private EmployeeType employeeType;
	private Integer employeetypeid;
	private String photo;
	private String username;

	@ManyToOne
	@JoinColumn(name="jobtitleid", insertable=false, updatable=false)
	private JobTitle jobTitle;
	private Integer jobtitleid;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date hireDate;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(EmployeeType employeeType, Integer employeetypeid, String photo, String username, JobTitle jobTitle,
			Integer jobtitleid, Date hireDate) {
		super();
		this.employeeType = employeeType;
		this.employeetypeid = employeetypeid;
		this.photo = photo;
		this.username = username;
		this.jobTitle = jobTitle;
		this.jobtitleid = jobtitleid;
		this.hireDate = hireDate;
	}

	public EmployeeType getEmployeeType() {
		return employeeType;
	}

	public void setEmployeeType(EmployeeType employeeType) {
		this.employeeType = employeeType;
	}

	public Integer getEmployeetypeid() {
		return employeetypeid;
	}

	public void setEmployeetypeid(Integer employeetypeid) {
		this.employeetypeid = employeetypeid;
	}

	@Override
	public String getPhoto() {
		return photo;
	}

	@Override
	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public JobTitle getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(JobTitle jobTitle) {
		this.jobTitle = jobTitle;
	}

	public Integer getJobtitleid() {
		return jobtitleid;
	}

	public void setJobtitleid(Integer jobtitleid) {
		this.jobtitleid = jobtitleid;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}


}
