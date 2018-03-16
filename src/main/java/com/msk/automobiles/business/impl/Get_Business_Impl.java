package com.msk.automobiles.business.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msk.automobiles.business.interfaces.Get_Business_Interface;
import com.msk.automobiles.dao.interfaces.Get_DAO_Interface;
import com.msk.automobiles.service.entities.Car_Brands;
import com.msk.automobiles.service.entities.Car_Models;
import com.msk.automobiles.service.pojos.UICar_Brands;
import com.msk.automobiles.service.pojos.UICar_Models;

@Service
public class Get_Business_Impl implements Get_Business_Interface {

	@Autowired
	Get_DAO_Interface get_DAO_Interface;

	@Override
	public List<UICar_Brands> getAllBrands() {
		List<Car_Brands> brands = get_DAO_Interface.getAllBrands();
		List<UICar_Brands> uiCar_Brands = new ArrayList<UICar_Brands>();

		if (!brands.isEmpty()) {
			for (int i = 0; i < brands.size(); i++) {
				UICar_Brands car_Brands = new UICar_Brands();
				car_Brands.setBrand_id(Integer.toString(brands.get(i).getId()));
				car_Brands.setBrand(brands.get(i).getBrand());
				car_Brands.setLogo(brands.get(i).getLogo());

				uiCar_Brands.add(car_Brands);
			}
		}

		return uiCar_Brands;
	}

	@Override
	public List<UICar_Models> getModels(String car_brands_id) {
		List<Car_Models> models = get_DAO_Interface.getModels(Integer.parseInt(car_brands_id));
		List<UICar_Models> uiCar_Models = new ArrayList<UICar_Models>();

		if (!models.isEmpty()) {
			for (int i = 0; i < models.size(); i++) {
				UICar_Models car_Models = new UICar_Models();
				car_Models.setBrand_id(Integer.toString(models.get(i).getCar_Brands().getId()));
				car_Models.setModel_id(Integer.toString(models.get(i).getId()));
				car_Models.setModel(models.get(i).getModels());
				car_Models.setImage(models.get(i).getModel_image());

				uiCar_Models.add(car_Models);
			}
		}

		return uiCar_Models;
	}

}
