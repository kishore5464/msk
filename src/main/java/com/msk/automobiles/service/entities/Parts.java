package com.msk.automobiles.service.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "parts")
public class Parts implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;
	private Car_Models car_Models;
	private String part;
	private Integer quantity;
	private Double amount;
	private Date created_date;

	public Parts() {
		super();
	}

	public Parts(Integer id, Car_Models car_Models, String part, Integer quantity, Double amount, Date created_date) {
		super();
		this.id = id;
		this.car_Models = car_Models;
		this.part = part;
		this.setQuantity(quantity);
		this.amount = amount;
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
	@JoinColumn(name = "car_models_id")
	public Car_Models getCar_Models() {
		return car_Models;
	}

	public void setCar_Models(Car_Models car_Models) {
		this.car_Models = car_Models;
	}

	@Column(name = "part")
	public String getPart() {
		return part;
	}

	public void setPart(String part) {
		this.part = part;
	}

	@Column(name = "quantity")
	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Column(name = "amount")
	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_date")
	public Date getCreated_date() {
		return created_date;
	}

	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}

}
