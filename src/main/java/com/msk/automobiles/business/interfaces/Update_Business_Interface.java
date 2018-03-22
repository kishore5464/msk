package com.msk.automobiles.business.interfaces;

public interface Update_Business_Interface {

	String updateMSKOwnerPassword(String username, String password);

	void updateSparePartsInStock(String spare_part_id, String quantity, String price_per_unit);

}
