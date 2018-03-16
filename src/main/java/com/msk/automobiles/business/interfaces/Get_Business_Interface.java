package com.msk.automobiles.business.interfaces;

import java.util.List;

import com.msk.automobiles.service.pojos.UICar_Brands;
import com.msk.automobiles.service.pojos.UICar_Models;

public interface Get_Business_Interface {

	List<UICar_Brands> getAllBrands();

	List<UICar_Models> getModels(String car_brands_id);

}
