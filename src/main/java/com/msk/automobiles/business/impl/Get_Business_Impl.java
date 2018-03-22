package com.msk.automobiles.business.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msk.automobiles.business.interfaces.Get_Business_Interface;
import com.msk.automobiles.dao.interfaces.Get_DAO_Interface;
import com.msk.automobiles.dao.interfaces.Update_DAO_Interface;
import com.msk.automobiles.service.entities.Car_Brands;
import com.msk.automobiles.service.entities.Car_Models;
import com.msk.automobiles.service.entities.Customer_Details;
import com.msk.automobiles.service.entities.Location;
import com.msk.automobiles.service.entities.MSK_Owner;
import com.msk.automobiles.service.entities.Parts;
import com.msk.automobiles.service.entities.Service_Invoice_Card;
import com.msk.automobiles.service.entities.Service_Type;
import com.msk.automobiles.service.pojos.Car_Brands_Pojo;
import com.msk.automobiles.service.pojos.Car_Models_Pojo;
import com.msk.automobiles.service.pojos.Customer_Details_Pojo;
import com.msk.automobiles.service.pojos.Location_Pojo;
import com.msk.automobiles.service.pojos.Service_Type_Pojo;
import com.msk.automobiles.service.pojos.Spare_Parts_Pojo;
import com.msk.automobiles.util.Encrypt_Decrypt;

@Service
public class Get_Business_Impl implements Get_Business_Interface {

	@Autowired
	Get_DAO_Interface get_DAO_Interface;

	@Autowired
	Update_DAO_Interface update_DAO_Interface;

	@Override
	public List<Car_Brands_Pojo> getAllBrands(String type) {
		// TODO Auto-generated method stub
		List<Car_Brands> brands = get_DAO_Interface.getAllBrands();
		List<Car_Brands_Pojo> uiCar_Brands = new ArrayList<Car_Brands_Pojo>();

		if (!brands.isEmpty()) {
			for (int i = 0; i < brands.size(); i++) {
				Car_Brands_Pojo car_Brands_Pojo = new Car_Brands_Pojo();
				car_Brands_Pojo.setBrand_id(Integer.toString(brands.get(i).getId()));
				car_Brands_Pojo.setBrand(brands.get(i).getBrand().replace("+", " "));

				if (type.equals("service")) {
					if (brands.get(i).getLogo() == null || brands.get(i).getLogo().equals("")) {
						car_Brands_Pojo.setLogo("noimage");
					} else {
						car_Brands_Pojo.setLogo(brands.get(i).getLogo());
					}
				}

				uiCar_Brands.add(car_Brands_Pojo);
			}
		}

		return uiCar_Brands;
	}

	@Override
	public List<Car_Models_Pojo> getModels(String car_brands_id, String type) {
		// TODO Auto-generated method stub
		List<Car_Models> models = get_DAO_Interface.getModelsByBrandId(Integer.parseInt(car_brands_id));
		List<Car_Models_Pojo> uiCar_Models_Pojos = new ArrayList<Car_Models_Pojo>();

		System.out.println(models.size());
		if (!models.isEmpty()) {
			for (int i = 0; i < models.size(); i++) {
				Car_Models_Pojo car_Models_Pojo = new Car_Models_Pojo();
				car_Models_Pojo.setBrand_id(Integer.toString(models.get(i).getCar_Brands().getId()));
				car_Models_Pojo.setModel_id(Integer.toString(models.get(i).getId()));
				car_Models_Pojo.setModel(models.get(i).getModel().replace("+", " "));

				if (type.equals("service")) {
					if (models.get(i).getImage() == null || models.get(i).getImage().equals("")) {
						car_Models_Pojo.setImage("noimage");
					} else {
						car_Models_Pojo.setImage(models.get(i).getImage());
					}
				}

				uiCar_Models_Pojos.add(car_Models_Pojo);
			}
		}

		return uiCar_Models_Pojos;
	}

	@Override
	public String getMSKOwnerDetail(String username, String password) {
		// TODO Auto-generated method stub
		List<MSK_Owner> msk_Owner = get_DAO_Interface.getMSKOwnerDetail(username);
		Encrypt_Decrypt password_Encrypt_Decrypt = new Encrypt_Decrypt();
		String encrypt_password = password_Encrypt_Decrypt.encrypt(password);

		String status = null;

		if (!msk_Owner.isEmpty()) {
			if (encrypt_password.equals(msk_Owner.get(0).getPassword())) {
				status = "success";
			} else {
				status = "failure";
			}
		} else {
			status = "failure";
		}

		return status;
	}

	@Override
	public List<Customer_Details_Pojo> getExistingCustomerDetails() {
		// TODO Auto-generated method stub
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

		List<Customer_Details> customer_Details = get_DAO_Interface.getAllCustomerDetails();
		List<Customer_Details_Pojo> customer_Details_Pojos = new ArrayList<Customer_Details_Pojo>();

		if (!customer_Details.isEmpty()) {
			for (int i = 0; i < customer_Details.size(); i++) {
				Customer_Details_Pojo customer_Details_Pojo = new Customer_Details_Pojo();
				customer_Details_Pojo.setCustomer_id(customer_Details.get(i).getCustomer_id());
				customer_Details_Pojo.setFirst_name(customer_Details.get(i).getFirst_name());
				customer_Details_Pojo.setMobile(customer_Details.get(i).getMobile());
				customer_Details_Pojo.setGst_no(customer_Details.get(i).getGst_no());
				customer_Details_Pojo.setRegistration_no(customer_Details.get(0).getRegistration_no());

				List<Car_Models> car_Model = get_DAO_Interface
						.getModelById(customer_Details.get(i).getCar_Models().getId());
				customer_Details_Pojo.setModel(car_Model.get(0).getModel());

				List<Service_Invoice_Card> service_Invoice_Cards = get_DAO_Interface
						.getSericeInvoiceCard(customer_Details.get(i).getId());
				customer_Details_Pojo.setCurrent_service_date(dateFormat
						.format(service_Invoice_Cards.get(service_Invoice_Cards.size() - 1).getService_expire_date()));

				customer_Details_Pojos.add(customer_Details_Pojo);
			}
		}

		return customer_Details_Pojos;
	}

	@Override
	public List<Location_Pojo> getLocation() {
		// TODO Auto-generated method stub
		List<Location> locations = get_DAO_Interface.getLocation();
		List<Location_Pojo> location_Pojos = new ArrayList<Location_Pojo>();

		if (!locations.isEmpty()) {
			for (int i = 0; i < locations.size(); i++) {
				Location_Pojo location_Pojo = new Location_Pojo();
				location_Pojo.setId(Integer.toString(locations.get(i).getId()));
				location_Pojo.setCity(locations.get(i).getCity());

				location_Pojos.add(location_Pojo);
			}
		}

		return location_Pojos;
	}

	@Override
	public List<Service_Type_Pojo> getServiceType() {
		// TODO Auto-generated method stub
		List<Service_Type> service_Types = get_DAO_Interface.getServiceType();
		List<Service_Type_Pojo> service_Type_Pojos = new ArrayList<Service_Type_Pojo>();

		if (!service_Types.isEmpty()) {
			for (int i = 0; i < service_Types.size(); i++) {
				Service_Type_Pojo service_Type_Pojo = new Service_Type_Pojo();
				service_Type_Pojo.setId(Integer.toString(service_Types.get(i).getId()));
				service_Type_Pojo.setService_type(service_Types.get(i).getService_type());

				service_Type_Pojos.add(service_Type_Pojo);
			}
		}

		return service_Type_Pojos;
	}

	@Override
	public String getServiceCardNo() {
		// TODO Auto-generated method stub
		List<Service_Invoice_Card> service_Invoice_Cards = get_DAO_Interface.getServiceInvoiceCards();
		String service_card_id = null;

		if (!service_Invoice_Cards.isEmpty()) {
			if (service_Invoice_Cards.get(service_Invoice_Cards.size() - 1).getId() <= 9) {
				service_card_id = "MSK 00" + service_Invoice_Cards.get(service_Invoice_Cards.size() - 1).getId();
			} else if (service_Invoice_Cards.get(service_Invoice_Cards.size() - 1).getId() >= 10
					&& service_Invoice_Cards.get(service_Invoice_Cards.size() - 1).getId() <= 99) {
				service_card_id = "MSK 0" + service_Invoice_Cards.get(service_Invoice_Cards.size() - 1).getId();
			} else if (service_Invoice_Cards.get(service_Invoice_Cards.size() - 1).getId() >= 100
					&& service_Invoice_Cards.get(service_Invoice_Cards.size() - 1).getId() <= 999) {
				service_card_id = "MSK " + service_Invoice_Cards.get(service_Invoice_Cards.size() - 1).getId();
			}
		} else {
			service_card_id = "MSK 001";
		}

		return service_card_id;
	}

	@Override
	public List<Spare_Parts_Pojo> getSparePartsInStock(String stock_status) {
		// TODO Auto-generated method stub
		List<Parts> spare_parts = get_DAO_Interface.getSparePartsInStock(stock_status);
		List<Spare_Parts_Pojo> spare_Parts_Pojos = new ArrayList<Spare_Parts_Pojo>();

		if (!spare_parts.isEmpty()) {
			for (int i = 0; i < spare_parts.size(); i++) {
				Spare_Parts_Pojo spare_Parts_Pojo = new Spare_Parts_Pojo();

				List<Car_Models> models = get_DAO_Interface.getModelById(spare_parts.get(i).getCar_Models().getId());

				spare_Parts_Pojo.setId(Integer.toString(i + 1));
				spare_Parts_Pojo.setBrand(get_DAO_Interface.getBrandById(models.get(0).getCar_Brands().getId()).get(0)
						.getBrand().replace("+", " "));
				spare_Parts_Pojo.setModel(models.get(0).getModel().replace("+", " "));
				spare_Parts_Pojo.setSpare_part_id(Integer.toString(spare_parts.get(i).getId()));
				spare_Parts_Pojo.setSpare_part_name(spare_parts.get(i).getPart());
				spare_Parts_Pojo.setQuantity(Integer.toString(spare_parts.get(i).getQuantity()));
				spare_Parts_Pojo.setPrice_per_unit(Double.toString(spare_parts.get(i).getAmount()));
				spare_Parts_Pojo.setTotal_price(
						Double.toString((spare_parts.get(i).getQuantity() * spare_parts.get(i).getAmount())));

				spare_Parts_Pojos.add(spare_Parts_Pojo);
			}
		}

		return spare_Parts_Pojos;
	}

	@Override
	public List<String> getSparePartsAtParticularModel(String model_id) {
		// TODO Auto-generated method stub
		List<Parts> parts = get_DAO_Interface.getSparePartsAtParticularModel(model_id);
		List<String> parts_list = new ArrayList<String>();

		if (!parts.isEmpty()) {
			for (int i = 0; i < parts.size(); i++) {
				String part = parts.get(i).getPart();
				parts_list.add(part);
			}
		}

		return parts_list;
	}

	@Override
<<<<<<< HEAD
	public String getVerifyAccessCode(String username, String access_code) {
		// TODO Auto-generated method stub
		List<MSK_Owner> msk_Owners = get_DAO_Interface.getMSKOwnerDetail(username);
		String status = "failure";

		if (!msk_Owners.isEmpty()) {
			Encrypt_Decrypt encrypt_Decrypt = new Encrypt_Decrypt();
			String access = encrypt_Decrypt.decrypt(msk_Owners.get(0).getAccess_code());
			if (access.equals(access_code)) {
				msk_Owners.get(0).setAccess_code("0");
				update_DAO_Interface.updateMSKOwner(msk_Owners.get(0));
				status = "success";
			}
		}

		return status;
=======
	public Spare_Parts_Pojo getSparePartsAtParticularModelParts(String model_id, String part) {
		// TODO Auto-generated method stub
		List<Parts> spare_parts = get_DAO_Interface.getSparePartsAtParticularModelParts(Integer.parseInt(model_id),
				part);
		Spare_Parts_Pojo spare_Parts_Pojo = new Spare_Parts_Pojo();

		if (!spare_parts.isEmpty()) {
			List<Car_Models> models = get_DAO_Interface.getModelById(spare_parts.get(0).getCar_Models().getId());

			spare_Parts_Pojo.setBrand(get_DAO_Interface.getBrandById(models.get(0).getCar_Brands().getId()).get(0)
					.getBrand().replace("+", " "));
			spare_Parts_Pojo.setId("1");
			spare_Parts_Pojo.setModel(models.get(0).getModel().replace("+", " "));
			spare_Parts_Pojo.setPrice_per_unit(Double.toString(spare_parts.get(0).getAmount()));
			spare_Parts_Pojo.setQuantity(Integer.toString(spare_parts.get(0).getQuantity()));
			spare_Parts_Pojo.setSpare_part_id(Integer.toString(spare_parts.get(0).getId()));
			spare_Parts_Pojo.setSpare_part_name(spare_parts.get(0).getPart());
			spare_Parts_Pojo.setTotal_price(
					Double.toString((spare_parts.get(0).getQuantity() * spare_parts.get(0).getAmount())));
		} else {
			spare_Parts_Pojo.setId("0");
		}

		return spare_Parts_Pojo;
>>>>>>> 1cd9c0baa408783731c66bb6cc13182707d101a3
	}

}
