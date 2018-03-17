package com.msk.automobiles.service.pojos;

public class UICar_Brands {

	private String brand_id;
	private String brand;
	private String logo;

	public UICar_Brands() {
		super();
	}

	public UICar_Brands(String brand_id, String brand, String logo) {
		super();
		this.brand_id = brand_id;
		this.brand = brand;
		this.logo = logo;
	}

	public String getBrand_id() {
		return brand_id;
	}

	public void setBrand_id(String brand_id) {
		this.brand_id = brand_id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	@Override
	public String toString() {
		return "UICar_Brands [brand_id=" + brand_id + ", brand=" + brand + ", logo=" + logo + "]";
	}

}
