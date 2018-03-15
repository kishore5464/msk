package com.msk.automobiles.business.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msk.automobiles.business.interfaces.Insert_Business_Interface;
import com.msk.automobiles.dao.interfaces.Get_DAO_Interface;
import com.msk.automobiles.dao.interfaces.Insert_DAO_Interface;

@Service
public class Insert_Business_Impl implements Insert_Business_Interface {

	@Autowired
	Get_DAO_Interface get_DAO_Interface;

	@Autowired
	Insert_DAO_Interface insert_DAO_Interface;

}
