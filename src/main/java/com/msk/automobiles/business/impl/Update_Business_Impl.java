package com.msk.automobiles.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msk.automobiles.business.interfaces.Update_Business_Interface;
import com.msk.automobiles.dao.interfaces.Get_DAO_Interface;
import com.msk.automobiles.dao.interfaces.Update_DAO_Interface;
import com.msk.automobiles.service.entities.MSK_Owner;
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

			update_DAO_Interface.updateMSKOwnerPassword(msk_Owner.get(0));
			status = "updated";
		}

		return status;
	}

}
