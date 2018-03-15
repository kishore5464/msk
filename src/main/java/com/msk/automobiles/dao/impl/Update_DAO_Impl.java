package com.msk.automobiles.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.msk.automobiles.dao.interfaces.Update_DAO_Interface;

@Repository
public class Update_DAO_Impl implements Update_DAO_Interface {

	@Autowired
	SessionFactory sessionFactory;

}
