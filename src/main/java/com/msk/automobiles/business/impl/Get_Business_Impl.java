package com.msk.automobiles.business.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msk.automobiles.business.interfaces.Get_Business_Interface;
import com.msk.automobiles.dao.interfaces.Get_DAO_Interface;
import com.msk.automobiles.service.entities.Car_Brands;
import com.msk.automobiles.service.pojos.UICar_Brands;

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

}
