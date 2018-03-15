package com.msk.automobiles.service.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "car_models")
public class Car_Models implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;
	private Car_Brands car_Brands;
	private String models;
	private String model_image;
	private String fuel_type;
	private Date created_date;

	private Set<Customer_Details> customer_Details = new HashSet<Customer_Details>();
	private Set<Parts> parts = new HashSet<Parts>();

	public Car_Models() {
		super();
	}

	public Car_Models(Integer id, Car_Brands car_Brands, String models, String model_image, String fuel_type,
			Date created_date) {
		super();
		this.id = id;
		this.car_Brands = car_Brands;
		this.models = models;
		this.model_image = model_image;
		this.fuel_type = fuel_type;
		this.created_date = created_date;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "car_brands_id")
	public Car_Brands getCar_Brands() {
		return car_Brands;
	}

	public void setCar_Brands(Car_Brands car_Brands) {
		this.car_Brands = car_Brands;
	}

	@Column(name = "models")
	public String getModels() {
		return models;
	}

	public void setModels(String models) {
		this.models = models;
	}

	@Column(name = "fuel_type")
	public String getFuel_type() {
		return fuel_type;
	}

	public void setFuel_type(String fuel_type) {
		this.fuel_type = fuel_type;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_date")
	public Date getCreated_date() {
		return created_date;
	}

	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "car_Models")
	public Set<Customer_Details> getCustomer_Details() {
		return customer_Details;
	}

	public void setCustomer_Details(Set<Customer_Details> customer_Details) {
		this.customer_Details = customer_Details;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "car_Models")
	public Set<Parts> getParts() {
		return parts;
	}

	public void setParts(Set<Parts> parts) {
		this.parts = parts;
	}

	@Column(name = "model_image")
	public String getModel_image() {
		return model_image;
	}

	public void setModel_image(String model_image) {
		this.model_image = model_image;
	}
}
