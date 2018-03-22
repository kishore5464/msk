package com.msk.automobiles.service.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.server.mvc.Viewable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;

import com.msk.automobiles.business.interfaces.Get_Business_Interface;
import com.msk.automobiles.business.interfaces.Insert_Business_Interface;
import com.msk.automobiles.business.interfaces.Update_Business_Interface;
import com.msk.automobiles.exception.CustomGenericException;
import com.msk.automobiles.service.pojos.Car_Brands_Pojo;
import com.msk.automobiles.service.pojos.Car_Models_Pojo;
import com.msk.automobiles.service.pojos.Customer_Details_Pojo;
import com.msk.automobiles.service.pojos.Location_Pojo;
import com.msk.automobiles.service.pojos.Service_Type_Pojo;
import com.msk.automobiles.service.pojos.Spare_Parts_Pojo;

import net.minidev.json.JSONObject;

@Configuration
@PropertySource("classpath:/application_path.properties")
@Controller
@Path("/")
public class ListsController {

	@Autowired
	Get_Business_Interface get_Business_Interface;

	@Autowired
	Insert_Business_Interface insert_Business_Interface;

	@Autowired
	Update_Business_Interface update_Business_Interface;

	@GET
	@Path("/car-brand")
	public Response car_brand() {
		JSONObject mix = new JSONObject();
		JSONObject data = new JSONObject();

		Viewable view = null;
		try {
			List<Car_Brands_Pojo> brands = get_Business_Interface.getAllBrands();

			data.put("brands", brands);

			mix.put("data", data);

			view = new Viewable("/car_brands", mix);

		} catch (Exception e) {
			throw new CustomGenericException("" + e.hashCode(), e.getMessage());
		}

		return Response.ok().entity(view).build();
	}

	@POST
	@Path("/{brand}/car-models")
	public Response car_models(@FormParam("brand_id") String brand_id, @Context HttpServletRequest request) {
		JSONObject mix = new JSONObject();
		JSONObject data = new JSONObject();

		Viewable view = null;
		try {
			List<Car_Models_Pojo> models = get_Business_Interface.getModels(brand_id);

			data.put("models", models);

			if (!models.isEmpty()) {
				data.put("brand_id", models.get(0).getBrand_id());
			}

			mix.put("data", data);

			view = new Viewable("/car_models", mix);

		} catch (Exception e) {
			throw new CustomGenericException("" + e.hashCode(), e.getMessage());
		}

		return Response.ok().entity(view).build();
	}

	@GET
	@Path("/customer-detail")
	public Response customer_detail() {
		JSONObject mix = new JSONObject();
		JSONObject data = new JSONObject();

		Viewable view = null;
		try {
			List<Customer_Details_Pojo> existing_customer = get_Business_Interface.getExistingCustomerDetails();

			data.put("customer", existing_customer);
			mix.put("data", data);

			view = new Viewable("/customer_detail", mix);
		} catch (Exception e) {
			throw new CustomGenericException("" + e.hashCode(), e.getMessage());
		}

		return Response.ok().entity(view).build();
	}

	@GET
	@Path("/spare-parts")
	public Response spare_parts() {
		JSONObject mix = new JSONObject();
		JSONObject data = new JSONObject();

		Viewable view = null;

		try {
			List<Spare_Parts_Pojo> spare_Parts_Pojos = get_Business_Interface.getSparePartsInStock();

			data.put("spare_parts", spare_Parts_Pojos);
			mix.put("data", data);

			view = new Viewable("/spareparts", mix);
		} catch (Exception e) {
			throw new CustomGenericException("" + e.hashCode(), e.getMessage());
		}

		return Response.ok().entity(view).build();
	}

	@GET
	@Path("/location")
	public Response location() {
		JSONObject mix = new JSONObject();
		JSONObject data = new JSONObject();

		try {
			List<Location_Pojo> location_Pojos = get_Business_Interface.getLocation();
			data.put("location", location_Pojos);
			mix.put("data", data);
		} catch (Exception e) {
			throw new CustomGenericException("" + e.hashCode(), e.getMessage());
		}

		return Response.ok().entity(mix.toString()).build();
	}

	@GET
	@Path("/service-type")
	public Response service_type() {
		JSONObject mix = new JSONObject();
		JSONObject data = new JSONObject();

		try {
			List<Service_Type_Pojo> service_Type_Pojos = get_Business_Interface.getServiceType();
			data.put("service_type", service_Type_Pojos);
			mix.put("data", data);
		} catch (Exception e) {
			throw new CustomGenericException("" + e.hashCode(), e.getMessage());
		}

		return Response.ok().entity(mix.toString()).build();
	}

}
