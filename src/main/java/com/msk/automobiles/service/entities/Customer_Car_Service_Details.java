package com.msk.automobiles.service.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
@Table(name = "customer_car_service_details")
public class Customer_Car_Service_Details implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;
	private Customer_Details customer_Details;
	private Date service_from;
	private Date service_to;
	private Date service_expire_date;
	private String service;
	private Payment_Mode payment_Mode;
	private Double amount;
	private Date created_date;

	public Customer_Car_Service_Details() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer_Car_Service_Details(Integer id, Customer_Details customer_Details, Date service_from,
			Date service_to, Date service_expire_date, String service, Payment_Mode payment_Mode, Double amount,
			Date created_date) {
		super();
		this.id = id;
		this.customer_Details = customer_Details;
		this.service_from = service_from;
		this.service_to = service_to;
		this.setService_expire_date(service_expire_date);
		this.service = service;
		this.payment_Mode = payment_Mode;
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
	@JoinColumn(name = "customer_details_id")
	public Customer_Details getCustomer_Details() {
		return customer_Details;
	}

	public void setCustomer_Details(Customer_Details customer_Details) {
		this.customer_Details = customer_Details;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "service_from")
	public Date getService_from() {
		return service_from;
	}

	public void setService_from(Date service_from) {
		this.service_from = service_from;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "service_to")
	public Date getService_to() {
		return service_to;
	}

	public void setService_to(Date service_to) {
		this.service_to = service_to;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "service_expire_date")
	public Date getService_expire_date() {
		return service_expire_date;
	}

	public void setService_expire_date(Date service_expire_date) {
		this.service_expire_date = service_expire_date;
	}

	@Column(name = "service")
	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	@Column(name = "payment_mode")
	@Enumerated(EnumType.STRING)
	public Payment_Mode getPayment_Mode() {
		return payment_Mode;
	}

	public void setPayment_Mode(Payment_Mode payment_Mode) {
		this.payment_Mode = payment_Mode;
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
