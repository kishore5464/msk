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
@Table(name = "notification")
public class Notification implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

	private Customer_Details customer_Details;
	private Car_Models car_Models;
	private Service_Invoice_Card service_Invoice_Card;

	private Date expire_date;
	private Integer view_status;
	private Date created_date;

	public Notification() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Notification(Integer id, Customer_Details customer_Details, Car_Models car_Models,
			Service_Invoice_Card service_Invoice_Card, Date expire_date, Integer view_status, Date created_date) {
		super();
		this.id = id;
		this.customer_Details = customer_Details;
		this.car_Models = car_Models;
		this.setService_Invoice_Card(service_Invoice_Card);
		this.expire_date = expire_date;
		this.view_status = view_status;
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
	@JoinColumn(name = "customer_details_id")
	public Customer_Details getCustomer_Details() {
		return customer_Details;
	}

	public void setCustomer_Details(Customer_Details customer_Details) {
		this.customer_Details = customer_Details;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "model_id")
	public Car_Models getCar_Models() {
		return car_Models;
	}

	public void setCar_Models(Car_Models car_Models) {
		this.car_Models = car_Models;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "service_invoice_card_id")
	public Service_Invoice_Card getService_Invoice_Card() {
		return service_Invoice_Card;
	}

	public void setService_Invoice_Card(Service_Invoice_Card service_Invoice_Card) {
		this.service_Invoice_Card = service_Invoice_Card;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "expire_date")
	public Date getExpire_date() {
		return expire_date;
	}

	public void setExpire_date(Date expire_date) {
		this.expire_date = expire_date;
	}

	@Column(name = "view_status")
	public Integer getView_status() {
		return view_status;
	}

	public void setView_status(Integer view_status) {
		this.view_status = view_status;
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