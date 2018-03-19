package com.msk.automobiles.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msk.automobiles.business.interfaces.Insert_Business_Interface;
import com.msk.automobiles.dao.interfaces.Get_DAO_Interface;
import com.msk.automobiles.dao.interfaces.Insert_DAO_Interface;
import com.msk.automobiles.dao.interfaces.Update_DAO_Interface;
import com.msk.automobiles.service.entities.Car_Brands;
import com.msk.automobiles.service.entities.Car_Models;

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

}
