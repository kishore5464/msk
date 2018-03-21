package com.msk.automobiles.dao.interfaces;

import com.msk.automobiles.service.entities.Car_Brands;
import com.msk.automobiles.service.entities.Car_Models;
import com.msk.automobiles.service.entities.Customer_Contact_Details;
import com.msk.automobiles.service.entities.Customer_Details;

public interface Insert_DAO_Interface {

	void insertCarBrand(Car_Brands car_Brands);

	void insertCarModel(Car_Models car_Models);

	void insertCustomerDetails(Customer_Details customer_Details, Customer_Contact_Details customer_Contact_Details);

}
