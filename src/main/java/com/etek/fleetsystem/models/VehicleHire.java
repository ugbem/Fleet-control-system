package com.etek.fleetsystem.models;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class VehicleHire {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;

	@ManyToOne
	@JoinColumn(name="vehicleid", insertable=false, updatable=false)
	private Vehicle vehicle;
	private Integer vehicleid;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dateOut;

	private String timeOut;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dateIn;

	private String timeIn;

	@ManyToOne
	@JoinColumn(name="clientid", insertable=false, updatable=false)
	private Client client;
	private Integer clientid;

	@ManyToOne
	@JoinColumn(name="locationid", insertable=false, updatable=false)
	private Location location;
	private Integer locationid;

	private String price;

	private String remarks;

	public VehicleHire() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VehicleHire(int id, Vehicle vehicle, Integer vehicleid, Date dateOut, String timeOut, Date dateIn,
			String timeIn, Client client, Integer clientid, Location location, Integer locationid, String price,
			String remarks) {
		super();
		this.id = id;
		this.vehicle = vehicle;
		this.vehicleid = vehicleid;
		this.dateOut = dateOut;
		this.timeOut = timeOut;
		this.dateIn = dateIn;
		this.timeIn = timeIn;
		this.client = client;
		this.clientid = clientid;
		this.location = location;
		this.locationid = locationid;
		this.price = price;
		this.remarks = remarks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Integer getVehicleid() {
		return vehicleid;
	}

	public void setVehicleid(Integer vehicleid) {
		this.vehicleid = vehicleid;
	}

	public Date getDateOut() {
		return dateOut;
	}

	public void setDateOut(Date dateOut) {
		this.dateOut = dateOut;
	}

	public String getTimeOut() {
		return timeOut;
	}

	public void setTimeOut(String timeOut) {
		this.timeOut = timeOut;
	}

	public Date getDateIn() {
		return dateIn;
	}

	public void setDateIn(Date dateIn) {
		this.dateIn = dateIn;
	}

	public String getTimeIn() {
		return timeIn;
	}

	public void setTimeIn(String timeIn) {
		this.timeIn = timeIn;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Integer getClientid() {
		return clientid;
	}

	public void setClientid(Integer clientid) {
		this.clientid = clientid;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Integer getLocationid() {
		return locationid;
	}

	public void setLocationid(Integer locationid) {
		this.locationid = locationid;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}


}
