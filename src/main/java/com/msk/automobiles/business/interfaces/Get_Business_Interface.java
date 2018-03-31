package com.msk.automobiles.business.interfaces;

import java.util.List;

import com.msk.automobiles.service.pojos.Car_Brands_Pojo;
import com.msk.automobiles.service.pojos.Car_Models_Pojo;
import com.msk.automobiles.service.pojos.Customer_Details_Pojo;
import com.msk.automobiles.service.pojos.Location_Pojo;
import com.msk.automobiles.service.pojos.Notifcation_Message_Pojo;
import com.msk.automobiles.service.pojos.Notifcation_Pojo;
import com.msk.automobiles.service.pojos.Service_Advicer_Pojo;
import com.msk.automobiles.service.pojos.Service_Card_Pojo;
import com.msk.automobiles.service.pojos.Service_Parts_Pojo2;
import com.msk.automobiles.service.pojos.Service_Parts_Pojo3;
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

	String getVerifyAccessCode(String username, String access_code);

	Spare_Parts_Pojo getSparePartsAtParticularModelParts(String model_id, String part);

	List<Customer_Details_Pojo> getExistingCustomerModelDetails(String model_id);

	List<Notifcation_Message_Pojo> getServiceNotificationMessage();

	List<Service_Advicer_Pojo> getServiceAdvicers();

	Service_Card_Pojo getCustomerDetail(String customer_id);

	List<Notifcation_Pojo> getCustomerServiceNotification(String notification_id);

	List<Service_Parts_Pojo2> getSparePartsAtParticularModelPojo(String model_id);

	List<Service_Parts_Pojo3> getSparePartsAtParticularAmt(String part_id);

}
