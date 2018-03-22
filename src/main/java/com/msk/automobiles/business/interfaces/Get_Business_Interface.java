package com.msk.automobiles.business.interfaces;

import java.util.List;

import com.msk.automobiles.service.pojos.Car_Brands_Pojo;
import com.msk.automobiles.service.pojos.Car_Models_Pojo;
import com.msk.automobiles.service.pojos.Customer_Details_Pojo;
import com.msk.automobiles.service.pojos.Location_Pojo;
import com.msk.automobiles.service.pojos.Service_Type_Pojo;
import com.msk.automobiles.service.pojos.Spare_Parts_Pojo;

public interface Get_Business_Interface {

	List<Car_Brands_Pojo> getAllBrands(String type);

	List<Car_Models_Pojo> getModels(String car_brands_id, String type);

	String getMSKOwnerDetail(String username, String password);

	List<Customer_Details_Pojo> getExistingCustomerDetails();

	List<Location_Pojo> getLocation();

	List<Service_Type_Pojo> getServiceType();

	String getServiceCardNo();

	List<Spare_Parts_Pojo> getSparePartsInStock(String stock_status);

	List<String> getSparePartsAtParticularModel(String model_id);

<<<<<<< HEAD
	String getVerifyAccessCode(String username, String access_code);
=======
	Spare_Parts_Pojo getSparePartsAtParticularModelParts(String model_id, String part);
>>>>>>> 1cd9c0baa408783731c66bb6cc13182707d101a3

}
