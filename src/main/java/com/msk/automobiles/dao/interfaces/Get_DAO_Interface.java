package com.msk.automobiles.dao.interfaces;

import java.util.List;

import com.msk.automobiles.service.entities.Car_Brands;
import com.msk.automobiles.service.entities.Car_Models;
import com.msk.automobiles.service.entities.MSK_Owner;

public interface Get_DAO_Interface {

	List<Car_Brands> getAllBrands();

	List<Car_Models> getModels(Integer car_brands_id);

	List<MSK_Owner> getMSKOwnerDetail(String username);

	List<Car_Brands> getBrandById(Integer brand_id);

	List<Car_Models> getModelById(Integer model_id);

}
