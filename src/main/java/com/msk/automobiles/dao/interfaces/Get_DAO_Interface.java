package com.msk.automobiles.dao.interfaces;

import java.util.List;

import com.msk.automobiles.service.entities.Car_Brands;
import com.msk.automobiles.service.entities.Car_Models;

public interface Get_DAO_Interface {

	List<Car_Brands> getAllBrands();

	List<Car_Models> getModels(Integer car_brands_id);

}
