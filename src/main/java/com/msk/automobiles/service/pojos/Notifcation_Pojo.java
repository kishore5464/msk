package com.msk.automobiles.service.pojos;

public class Notifcation_Pojo {

	private String notification_id;
	private String customer_name;
	private String mobile;
	private String dob;
	private String car_brand;
	private String car_model;
	private String service_expire_date;

	public Notifcation_Pojo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Notifcation_Pojo(String notification_id, String customer_name, String mobile, String car_brand,
			String car_model, String service_expire_date, String dob) {
		super();
		this.notification_id = notification_id;
		this.customer_name = customer_name;
		this.mobile = mobile;
		this.car_brand = car_brand;
		this.car_model = car_model;
		this.service_expire_date = service_expire_date;
		this.dob = dob;
	}

	public String getNotification_id() {
		return notification_id;
	}

	public void setNotification_id(String notification_id) {
		this.notification_id = notification_id;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getCar_brand() {
		return car_brand;
	}

	public void setCar_brand(String car_brand) {
		this.car_brand = car_brand;
	}

	public String getCar_model() {
		return car_model;
	}

	public void setCar_model(String car_model) {
		this.car_model = car_model;
	}

	public String getService_expire_date() {
		return service_expire_date;
	}

	public void setService_expire_date(String service_expire_date) {
		this.service_expire_date = service_expire_date;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Notifcation_Pojo [notification_id=" + notification_id + ", customer_name=" + customer_name + ", mobile="
				+ mobile + ", dob=" + dob + ", car_brand=" + car_brand + ", car_model=" + car_model
				+ ", service_expire_date=" + service_expire_date + "]";
	}

}
