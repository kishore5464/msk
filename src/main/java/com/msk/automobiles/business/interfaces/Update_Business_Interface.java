package com.msk.automobiles.business.interfaces;

import java.util.List;

import com.msk.automobiles.service.pojos.Service_Card_Pojo;
import com.msk.automobiles.service.pojos.Service_Parts_Pojo;

public interface Update_Business_Interface {

	String updateMSKOwnerPassword(String username, String password);

	void updateSparePartsInStock(String spare_part_id, String quantity, String price_per_unit);

	Service_Card_Pojo updateExistingServiceCardStatus(String service_type, String invoice_no, String process_type);

	List<Service_Parts_Pojo> updateStockPartsAndStatus(String model_id, Service_Parts_Pojo service_Parts_Pojo);

}
