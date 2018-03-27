package com.msk.automobiles.service.pojos;

public class Notifcation_Pojo {
	private String notification_id;
	private String name;
	private String mobile;
	private String model;
	private String brand;
	private String registration_no;
	private String expire_date;

	public Notifcation_Pojo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Notifcation_Pojo(String notification_id, String name, String mobile, String model, String brand,
			String registration_no, String expire_date) {
		super();
		this.notification_id = notification_id;
		this.name = name;
		this.mobile = mobile;
		this.model = model;
		this.brand = brand;
		this.registration_no = registration_no;
		this.expire_date = expire_date;
	}

	public String getNotification_id() {
		return notification_id;
	}

	public void setNotification_id(String notification_id) {
		this.notification_id = notification_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getRegistration_no() {
		return registration_no;
	}

	public void setRegistration_no(String registration_no) {
		this.registration_no = registration_no;
	}

	public String getExpire_date() {
		return expire_date;
	}

	public void setExpire_date(String expire_date) {
		this.expire_date = expire_date;
	}

}
