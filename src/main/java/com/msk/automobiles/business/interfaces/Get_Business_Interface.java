package com.msk.automobiles.business.interfaces;

import java.util.List;

import com.msk.automobiles.service.pojos.Car_Brands_Pojo;
import com.msk.automobiles.service.pojos.Car_Models_Pojo;
import com.msk.automobiles.service.pojos.Customer_Details_Pojo;
import com.msk.automobiles.service.pojos.Location_Pojo;
import com.msk.automobiles.service.pojos.Service_Type_Pojo;

public interface Get_Business_Interface {

	List<Car_Brands_Pojo> getAllBrands();

	List<Car_Models_Pojo> getModels(String car_brands_id);

	String getMSKOwnerDetail(String username, String password);

	List<Customer_Details_Pojo> getExistingCustomerDetails();

	List<Location_Pojo> getLocation();

	List<Service_Type_Pojo> getServiceType();

	String getServiceCardNo();

}
