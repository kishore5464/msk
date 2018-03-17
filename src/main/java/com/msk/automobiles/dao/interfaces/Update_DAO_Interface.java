package com.msk.automobiles.dao.interfaces;

import com.msk.automobiles.service.entities.Car_Brands;
import com.msk.automobiles.service.entities.Car_Models;

public interface Update_DAO_Interface {

	void updateBrandDetail(Car_Brands car_Brands);

	void updateModelDetail(Car_Models car_Models);

}
