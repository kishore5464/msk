package com.msk.automobiles.service.controller;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;

import com.msk.automobiles.business.interfaces.Get_Business_Interface;
import com.msk.automobiles.business.interfaces.Insert_Business_Interface;
import com.msk.automobiles.business.interfaces.Update_Business_Interface;
import com.msk.automobiles.exception.CustomGenericException;

import net.minidev.json.JSONObject;

@Configuration
@PropertySource("classpath:/application_path.properties")
@Controller
@Path("/")
public class AddingController {

	// HERE I WROTE SERVLET FOR ADDING BRAND, MODEL, PARTS, CUSTOMER DETAILS

	@Autowired
	Get_Business_Interface get_Business_Interface;

	@Autowired
	Insert_Business_Interface insert_Business_Interface;

	@Autowired
	Update_Business_Interface update_Business_Interface;

	@POST
	@Path("/add-car-brand")
	public Response add_car_brand(@FormParam("brand") String brand, @FormParam("logo") String logo,
			@Context HttpServletRequest request) {
		String status = null;

		try {
			insert_Business_Interface.insertCarBrand(brand, logo);
			status = "success";
		} catch (Exception e) {
			throw new CustomGenericException("" + e.hashCode(), e.getMessage());
		}

		return Response.ok().entity(status).build();
	}

	@POST
	@Path("/add-car-model")
	public Response add_car_models(@FormParam("brand_id") String brand_id, @FormParam("model") String model,
			@FormParam("image") String image, @Context HttpServletRequest request) {
		String status = null;

		try {
			insert_Business_Interface.insertCarModel(brand_id, model, image);
			status = "success";
		} catch (Exception e) {
			throw new CustomGenericException("" + e.hashCode(), e.getMessage());
		}

		return Response.ok().entity(status).build();
	}

	@POST
	@Path("/add-customer-detail")
	public Response add_customer_detail(@FormParam("model_id") String model_id,
			@FormParam("first_name") String first_name, @FormParam("last_name") String last_name,
			@FormParam("mobile") String mobile, @FormParam("email") String email, @FormParam("dob") String dob,
			@FormParam("registration_no") String registration_no, @FormParam("gst_no") String gst_no,
			@Context HttpServletRequest request) {
		JSONObject mix = new JSONObject();
		JSONObject data = new JSONObject();
		try {
			Integer customer_detail_id = insert_Business_Interface.insertCustomerDetail(model_id, first_name, last_name,
					mobile, email, dob, registration_no, gst_no);

			data.put("customer_detail_id", customer_detail_id);
			mix.put("data", data);
		} catch (Exception e) {
			throw new CustomGenericException("" + e.hashCode(), e.getMessage());
		}

		return Response.ok().entity(mix.toString()).build();
	}

	@POST
	@Path("/add-customer-contact-detail")
	public Response add_customer_contact_detail(@FormParam("customer_id") String customer_id,
			@FormParam("address_line_1") String address_line_1, @FormParam("address_line_2") String address_line_2,
			@FormParam("location_id") String location_id, @FormParam("pincode") String pincode,
			@Context HttpServletRequest request) {
		JSONObject mix = new JSONObject();
		JSONObject data = new JSONObject();
		try {
			insert_Business_Interface.insertCustomerContactDetails(customer_id, address_line_1, address_line_2,
					location_id, pincode);
			String service_card_id = get_Business_Interface.getServiceCardNo();
			data.put("service_card_id", service_card_id);
			mix.put("data", data);
		} catch (Exception e) {
			throw new CustomGenericException("" + e.hashCode(), e.getMessage());
		}

		return Response.ok().entity(mix.toString()).build();
	}

	@POST
	@Path("/add-service-card")
	public Response add_service_card(@FormParam("customer_detail_id") String customer_detail_id,
			@FormParam("service_type_id") String service_type_id, @FormParam("kilometer") String kilometer,
			@FormParam("service") String service, @Context HttpServletRequest request) {
		String status = null;

		try {
//			insert_Business_Interface.insertCarBrand(brand, logo);
			status = "success";
		} catch (Exception e) {
			throw new CustomGenericException("" + e.hashCode(), e.getMessage());
		}

		return Response.ok().entity(status).build();
	}
}
