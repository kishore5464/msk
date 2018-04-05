package com.msk.automobiles.business.interfaces;

import com.msk.automobiles.service.pojos.Service_Card_Pojo;

public interface Update_Business_Interface {

	String updateMSKOwnerPassword(String username, String password);

	void updateSparePartsInStock(String spare_part_id, String quantity, String price_per_unit);

	Service_Card_Pojo updateExistingServiceCardStatus(String service_type, String invoice_no, String process_type);

}
