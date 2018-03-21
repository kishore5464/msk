package com.msk.automobiles.dao.interfaces;

import java.util.List;

import com.msk.automobiles.service.entities.Car_Brands;
import com.msk.automobiles.service.entities.Car_Models;
import com.msk.automobiles.service.entities.Customer_Contact_Details;
import com.msk.automobiles.service.entities.Customer_Details;
import com.msk.automobiles.service.entities.Location;
import com.msk.automobiles.service.entities.MSK_Owner;
import com.msk.automobiles.service.entities.Service_Invoice_Card;
import com.msk.automobiles.service.entities.Service_Type;

public interface Get_DAO_Interface {

	List<Car_Brands> getAllBrands();

	List<Car_Models> getModelsByBrandId(Integer car_brands_id);

	List<MSK_Owner> getMSKOwnerDetail(String username);

	List<Car_Brands> getBrandById(Integer brand_id);

	List<Car_Models> getModelById(Integer model_id);

	List<Car_Brands> getByBrand(String brand);

	List<Customer_Details> getAllCustomerDetails();

	List<Customer_Contact_Details> getCustomerContactDetails(Integer customer_id);

	List<Service_Invoice_Card> getSericeInvoiceCard(Integer customer_id);

	List<Location> getLocation();

	List<Service_Type> getServiceType();

	List<Service_Invoice_Card> getServiceInvoiceCards();

	String getLocationByCityId(String location_id);

}
