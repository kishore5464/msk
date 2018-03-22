package com.msk.automobiles.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msk.automobiles.business.interfaces.Update_Business_Interface;
import com.msk.automobiles.dao.interfaces.Get_DAO_Interface;
import com.msk.automobiles.dao.interfaces.Update_DAO_Interface;
import com.msk.automobiles.service.entities.Car_Models;
import com.msk.automobiles.service.entities.MSK_Owner;
import com.msk.automobiles.service.entities.Parts;
import com.msk.automobiles.service.entities.Stock_Status;
import com.msk.automobiles.util.Encrypt_Decrypt;

@Service
public class Update_Business_Impl implements Update_Business_Interface {

	@Autowired
	Update_DAO_Interface update_DAO_Interface;

	@Autowired
	Get_DAO_Interface get_DAO_Interface;

	@Override
	public String updateMSKOwnerPassword(String username, String password) {
		List<MSK_Owner> msk_Owner = get_DAO_Interface.getMSKOwnerDetail(username);

		String status = "not update";

		if (!msk_Owner.isEmpty()) {
			Encrypt_Decrypt encrypt_Decrypt = new Encrypt_Decrypt();
			msk_Owner.get(0).setPassword(encrypt_Decrypt.encrypt(password));

			update_DAO_Interface.updateMSKOwner(msk_Owner.get(0));
			status = "updated";
		}

		return status;
	}

	@Override
	public void updateSparePartsInStock(String spare_part_id, String quantity, String price_per_unit) {
		// TODO Auto-generated method stub
		List<Parts> parts = get_DAO_Interface.getSparePartsInStockById(spare_part_id);

		if (!parts.isEmpty()) {
			Car_Models car_Models = new Car_Models();
			car_Models.setId(parts.get(0).getCar_Models().getId());

			parts.get(0).setCar_Models(car_Models);
			parts.get(0).setQuantity(Integer.parseInt(quantity));
			parts.get(0).setAmount(Double.parseDouble(price_per_unit));
			parts.get(0).setParts_status(Stock_Status.INSTOCK);

			update_DAO_Interface.updateSparePartsInStock(parts.get(0));
		}
	}

}
