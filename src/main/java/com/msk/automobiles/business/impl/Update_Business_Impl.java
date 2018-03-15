package com.msk.automobiles.business.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msk.automobiles.business.interfaces.Update_Business_Interface;
import com.msk.automobiles.dao.interfaces.Get_DAO_Interface;
import com.msk.automobiles.dao.interfaces.Update_DAO_Interface;

@Service
public class Update_Business_Impl implements Update_Business_Interface {

	@Autowired
	Update_DAO_Interface update_DAO_Interface;

	@Autowired
	Get_DAO_Interface get_DAO_Interface;

}
