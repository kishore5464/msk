package com.msk.automobiles.service.pojos;

public class Service_Card_Pojo {

	private String invoice_no;
	private String first_name;
	private String mobile;
	private String registration_no;
	private String gst_no;
	private String address_line_1;
	private String address_line_2;
	private String city;
	private String pincode;

	public Service_Card_Pojo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Service_Card_Pojo(String invoice_no, String first_name, String mobile, String registration_no, String gst_no,
			String address_line_1, String address_line_2, String city, String pincode) {
		super();
		this.invoice_no = invoice_no;
		this.first_name = first_name;
		this.mobile = mobile;
		this.registration_no = registration_no;
		this.gst_no = gst_no;
		this.address_line_1 = address_line_1;
		this.address_line_2 = address_line_2;
		this.city = city;
		this.pincode = pincode;
	}

	public String getInvoice_no() {
		return invoice_no;
	}

	public void setInvoice_no(String invoice_no) {
		this.invoice_no = invoice_no;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getRegistration_no() {
		return registration_no;
	}

	public void setRegistration_no(String registration_no) {
		this.registration_no = registration_no;
	}

	public String getGst_no() {
		return gst_no;
	}

	public void setGst_no(String gst_no) {
		this.gst_no = gst_no;
	}

	public String getAddress_line_1() {
		return address_line_1;
	}

	public void setAddress_line_1(String address_line_1) {
		this.address_line_1 = address_line_1;
	}

	public String getAddress_line_2() {
		return address_line_2;
	}

	public void setAddress_line_2(String address_line_2) {
		this.address_line_2 = address_line_2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

}