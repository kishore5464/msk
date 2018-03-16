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
import com.msk.automobiles.service.entities.Car_Models;
import com.msk.automobiles.service.entities.MSK_Owner;

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

	@Override
	public List<Car_Models> getModels(Integer car_brands_id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery(" from Car_Models where car_brands_id = '" + car_brands_id + "'");
		List<Car_Models> car_Models = query.list();
		transaction.commit();
		session.flush();
		session.close();
		return car_Models;
	}

	@Override
	public List<MSK_Owner> getMSKOwnerDetail(String username) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery(" from MSK_Owner where (name = '" + username + "' or email = '" + username
				+ "' or mobile = '" + username + "')");
		List<MSK_Owner> msk_Owners = query.list();
		transaction.commit();
		session.flush();
		session.close();
		return msk_Owners;
	}

}
