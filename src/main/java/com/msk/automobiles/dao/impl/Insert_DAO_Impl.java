package com.msk.automobiles.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.msk.automobiles.dao.interfaces.Insert_DAO_Interface;
import com.msk.automobiles.service.entities.Car_Brands;
import com.msk.automobiles.service.entities.Car_Models;
import com.msk.automobiles.service.entities.Customer_Contact_Details;
import com.msk.automobiles.service.entities.Customer_Details;

@Repository
public class Insert_DAO_Impl implements Insert_DAO_Interface {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void insertCarBrand(Car_Brands car_Brands) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(car_Brands);
		transaction.commit();
		session.flush();
		session.close();
	}

	@Override
	public void insertCarModel(Car_Models car_Models) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(car_Models);
		transaction.commit();
		session.flush();
		session.close();
	}

	@Override
	public void insertCustomerDetails(Customer_Details customer_Details,
			Customer_Contact_Details customer_Contact_Details) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();

		Integer customer_detail_id = (Integer) session.save(customer_Details);
		customer_Details.setId(customer_detail_id);

		customer_Contact_Details.setCustomer_Details(customer_Details);

		session.save(customer_Contact_Details);
		session.close();
	}

}
