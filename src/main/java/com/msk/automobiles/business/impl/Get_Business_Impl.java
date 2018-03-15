package com.msk.automobiles.business.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msk.automobiles.business.interfaces.Get_Business_Interface;
import com.msk.automobiles.dao.interfaces.Get_DAO_Interface;

@Service
public class Get_Business_Impl implements Get_Business_Interface {

	@Autowired
	Get_DAO_Interface get_DAO_Interface;

}
