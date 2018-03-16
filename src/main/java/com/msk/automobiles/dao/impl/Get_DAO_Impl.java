package com.msk.automobiles.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.msk.automobiles.dao.interfaces.Get_DAO_Interface;
import com.msk.automobiles.service.entities.Car_Brands;

@Repository
@SuppressWarnings("unchecked")
public class Get_DAO_Impl implements Get_DAO_Interface {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public List<Car_Brands> getAllBrands() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery(" from Car_Brands ");
		List<Car_Brands> car_Brands = query.list();
		transaction.commit();
		session.flush();
		session.close();
		return car_Brands;
	}

}
