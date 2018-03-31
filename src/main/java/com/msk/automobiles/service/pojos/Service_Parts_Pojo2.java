package com.msk.automobiles.service.pojos;

public class Service_Parts_Pojo2 {

	private String part_id;
	private String part;

	public Service_Parts_Pojo2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Service_Parts_Pojo2(String part_id, String part) {
		super();
		this.part_id = part_id;
		this.part = part;
	}

	public String getPart_id() {
		return part_id;
	}

	public void setPart_id(String part_id) {
		this.part_id = part_id;
	}

	public String getPart() {
		return part;
	}

	public void setPart(String part) {
		this.part = part;
	}

}