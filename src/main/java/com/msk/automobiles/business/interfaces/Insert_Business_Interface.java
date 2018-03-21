package com.msk.automobiles.business.interfaces;

public interface Insert_Business_Interface {

	void insertOrUpdateBrandLogo(String brand_id, String logo);

	void insertOrUpdateModelLogo(String model_id, String logo);

	void insertCarBrand(String brand, String logo);

	void insertCarModel(String brand_id, String model, String image);

	Integer insertCustomerDetail(String model_id, String first_name, String last_name, String mobile, String email,
			String dob, String registration_no, String gst_no);

	void insertCustomerContactDetails(String customer_id, String address_line_1, String address_line_2,
			String location_id, String pincode);

}
