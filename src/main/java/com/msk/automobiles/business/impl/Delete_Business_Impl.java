package com.msk.automobiles.business.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msk.automobiles.business.interfaces.Delete_Business_Interface;
import com.msk.automobiles.dao.interfaces.Delete_DAO_Interface;
import com.msk.automobiles.dao.interfaces.Get_DAO_Interface;

@Service
public class Delete_Business_Impl implements Delete_Business_Interface {

	@Autowired
	Get_DAO_Interface get_DAO_Interface;

	@Autowired
	Delete_DAO_Interface delete_DAO_Interface;

}
