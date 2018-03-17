package com.msk.automobiles.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.msk.automobiles.dao.interfaces.Update_DAO_Interface;
import com.msk.automobiles.service.entities.Car_Brands;
import com.msk.automobiles.service.entities.Car_Models;

@Repository
public class Update_DAO_Impl implements Update_DAO_Interface {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void updateBrandDetail(Car_Brands car_Brands) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(car_Brands);
		transaction.commit();
		session.flush();
		session.close();
	}

	@Override
	public void updateModelDetail(Car_Models car_Models) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(car_Models);
		transaction.commit();
		session.flush();
		session.close();
	}

}
