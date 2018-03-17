package com.msk.automobiles.service.controller;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;

import org.glassfish.jersey.server.mvc.Viewable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;

import com.msk.automobiles.business.interfaces.Get_Business_Interface;
import com.msk.automobiles.business.interfaces.Insert_Business_Interface;
import com.msk.automobiles.business.interfaces.Update_Business_Interface;

@Configuration
@PropertySource("classpath:/application_path.properties")
@Controller
@Path("/")
public class TestHomeContorller {

	@Autowired
	Get_Business_Interface get_Business_Interface;

	@Autowired
	Insert_Business_Interface insert_Business_Interface;

	@Autowired
	Update_Business_Interface update_Business_Interface;

	@GET
	@Path("/")
	public Viewable get_index() {
		return new Viewable("/index");
	}

	@GET
	@Path("/dashboard")
	public Viewable dashboard() {
		return new Viewable("/dashboard");
	}

	@GET
	@Path("/index")
	public Viewable index() {
		return new Viewable("/index");
	}

	@GET
	@Path("/add-car-brand")
	public Viewable add_car_brand() {
		return new Viewable("/add_car_brand");
	}

	@GET
	@Path("/add-car-model")
	public Viewable add_car_model() {
		return new Viewable("/add_car_model");
	}

	@GET
	@Path("/customer-service-details")
	public Viewable view_customer_details() {
		return new Viewable("/view_customer_details");
	}

	@POST
	@Path("/upload-brand")
	public void upload_brand(@FormParam("brand_id") String brand_id, @FormParam("logo") String logo,
			@Context HttpServletRequest request) {

		System.out.println("OOOOOOOOOOOOOOOOOoo");
		System.out.println("KKKKKKKKKKKKKKKKKKKk  " + brand_id);
		insert_Business_Interface.insertOrUpdateBrandLogo(brand_id, logo);
	}

	@POST
	@Path("/upload-model")
	public void upload_model(@FormParam("model_id") String model_id, @FormParam("logo") String logo,
			@Context HttpServletRequest request) {

		insert_Business_Interface.insertOrUpdateModelLogo(model_id, logo);
	}
}
