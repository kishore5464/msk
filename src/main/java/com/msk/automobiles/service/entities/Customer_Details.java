package com.msk.automobiles.service.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "customer_details")
public class Customer_Details implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;
	private Car_Models car_Models;
	private String first_name;
	private String last_name;
	private String mobile;
	private String email;
	private Gender gender;
	private Date dob;
	private String gst_no;
	private Date created_date;

	private Set<Customer_Car_Service_Details> customer_Car_Service_Details = new HashSet<Customer_Car_Service_Details>();

	public Customer_Details() {
		super();
	}

	public Customer_Details(Integer id, Car_Models car_Models, String first_name, String last_name, String mobile,
			String email, Gender gender, Date dob, String gst_no, Date created_date) {
		super();
		this.id = id;
		this.car_Models = car_Models;
		this.first_name = first_name;
		this.last_name = last_name;
		this.mobile = mobile;
		this.email = email;
		this.gender = gender;
		this.dob = dob;
		this.gst_no = gst_no;
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

	@Column(name = "first_name", nullable = false)
	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	@Column(name = "last_name", nullable = true)
	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	@Column(name = "mobile", nullable = false)
	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Column(name = "email", nullable = true)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "gender")
	@Enumerated(EnumType.STRING)
	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "dob", nullable = true)
	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Column(name = "gst_no", nullable = true)
	public String getGst_no() {
		return gst_no;
	}

	public void setGst_no(String gst_no) {
		this.gst_no = gst_no;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_date")
	public Date getCreated_date() {
		return created_date;
	}

	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "customer_Details")
	public Set<Customer_Car_Service_Details> getCustomer_Car_Service_Details() {
		return customer_Car_Service_Details;
	}

	public void setCustomer_Car_Service_Details(Set<Customer_Car_Service_Details> customer_Car_Service_Details) {
		this.customer_Car_Service_Details = customer_Car_Service_Details;
	}

}
