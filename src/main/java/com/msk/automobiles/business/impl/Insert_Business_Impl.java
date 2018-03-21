package com.msk.automobiles.business.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msk.automobiles.business.interfaces.Insert_Business_Interface;
import com.msk.automobiles.dao.interfaces.Get_DAO_Interface;
import com.msk.automobiles.dao.interfaces.Insert_DAO_Interface;
import com.msk.automobiles.dao.interfaces.Update_DAO_Interface;
import com.msk.automobiles.service.entities.Car_Brands;
import com.msk.automobiles.service.entities.Car_Models;
import com.msk.automobiles.service.entities.Customer_Contact_Details;
import com.msk.automobiles.service.entities.Customer_Details;
import com.msk.automobiles.service.entities.Location;

@Service
public class Insert_Business_Impl implements Insert_Business_Interface {

	@Autowired
	Get_DAO_Interface get_DAO_Interface;

	@Autowired
	Insert_DAO_Interface insert_DAO_Interface;

	@Autowired
	Update_DAO_Interface update_DAO_Interface;

	@Override
	public void insertOrUpdateBrandLogo(String brand_id, String logo) {
		List<Car_Brands> brand = get_DAO_Interface.getBrandById(Integer.parseInt(brand_id));

		if (!brand.isEmpty()) {
			brand.get(0).setLogo(logo);

			update_DAO_Interface.updateBrandDetail(brand.get(0));
		}
	}

	@Override
	public void insertOrUpdateModelLogo(String model_id, String logo) {
		List<Car_Models> model = get_DAO_Interface.getModelById(Integer.parseInt(model_id));

		if (!model.isEmpty()) {
			model.get(0).setImage(logo);

			update_DAO_Interface.updateModelDetail(model.get(0));
		}
	}

	@Override
	public void insertCarBrand(String brand, String logo) {
		Car_Brands car_Brands = new Car_Brands();
		car_Brands.setBrand(brand);
		car_Brands.setLogo(logo);

		insert_DAO_Interface.insertCarBrand(car_Brands);
	}

	@Override
	public void insertCarModel(String brand_id, String model, String image) {
		Car_Brands car_Brands = new Car_Brands();
		car_Brands.setId(Integer.parseInt(brand_id));

		Car_Models car_Models = new Car_Models();
		car_Models.setCar_Brands(car_Brands);
		car_Models.setModel(model);
		car_Models.setImage(image);

		insert_DAO_Interface.insertCarModel(car_Models);
	}

	@Override
	public Integer insertCustomerDetail(String model_id, String first_name, String last_name, String mobile,
			String email, String dob, String registration_no, String gst_no) {
		// TODO Auto-generated method stub
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Customer_Details customer_Details = new Customer_Details();

		Car_Models car_Models = new Car_Models();
		car_Models.setId(Integer.parseInt(model_id));

		customer_Details.setCar_Models(car_Models);
		customer_Details.setCustomer_id("MSK ");
		customer_Details.setFirst_name(first_name);
		customer_Details.setLast_name(last_name);
		customer_Details.setMobile(mobile);
		customer_Details.setEmail(email);
		try {
			customer_Details.setDob(dateFormat.parse(dob));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		customer_Details.setRegistration_no(registration_no);
		customer_Details.setGst_no(gst_no);

		Integer customer_detail_id = insert_DAO_Interface.insertCustomerDetails(customer_Details);

		return customer_detail_id;
	}

	@Override
	public void insertCustomerContactDetails(String customer_detail_id, String address_line_1, String address_line_2,
			String location_id, String pincode) {
		// TODO Auto-generated method stub
		Customer_Contact_Details customer_Contact_Details = new Customer_Contact_Details();

		Location location = new Location();
		location.setId(Integer.parseInt(location_id));
		customer_Contact_Details.setLocation(location);

		Customer_Details customer_Details = new Customer_Details();
		customer_Details.setId(Integer.parseInt(customer_detail_id));
		customer_Contact_Details.setCustomer_Details(customer_Details);

		customer_Contact_Details.setAddress_line_1(address_line_1);
		customer_Contact_Details.setAddress_line_2(address_line_2);
		customer_Contact_Details.setPincode(Integer.parseInt(pincode));

		insert_DAO_Interface.insertCustomerContactDetails(customer_Contact_Details);
	}

}
