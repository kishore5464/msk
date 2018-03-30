package com.msk.automobiles.service.controller;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
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
import com.msk.automobiles.service.pojos.Service_Card_Pojo;

import net.minidev.json.JSONObject;

@Configuration
@PropertySource("classpath:/application_path.properties")
@Controller
@Path("/")
public class GenericController {

	@Autowired
	Get_Business_Interface get_Business_Interface;

	@Autowired
	Insert_Business_Interface insert_Business_Interface;

	@Autowired
	Update_Business_Interface update_Business_Interface;

	@PUT
	@Path("/forget-password")
	public Response forget_password(@FormParam("username") String username, @Context HttpServletRequest request) {
		String status = null;

		try {
			status = insert_Business_Interface.insertAccessCodeAndSend(username);
		} catch (Exception e) {
			throw new CustomGenericException("" + e.hashCode(), e.getMessage());
		}

		return Response.ok().entity(status).build();
	}

	@PUT
	@Path("/verify-access")
	public Response verify_access(@FormParam("user_name") String username, @FormParam("access_code") String access_code,
			@Context HttpServletRequest request) {
		String status = null;

		try {
			status = get_Business_Interface.getVerifyAccessCode(username, access_code);
		} catch (Exception e) {
			throw new CustomGenericException("" + e.hashCode(), e.getMessage());
		}

		return Response.ok().entity(status).build();
	}

	@POST
	@Path("/service-card")
	public Response service_card_detail(@FormParam("customer_id") String customer_id,
			@Context HttpServletRequest request) {
		JSONObject mix = new JSONObject();
		JSONObject data = new JSONObject();

		Viewable view = null;

		// try {
		System.out.println(customer_id);
		Service_Card_Pojo service_Card_Pojo = get_Business_Interface.getCustomerDetail(customer_id);

		data.put("customer_detail", service_Card_Pojo);
		mix.put("data", data);

		view = new Viewable("/service_card", mix);
		// } catch (Exception e) {
		// throw new CustomGenericException("" + e.hashCode(), e.getMessage());
		// }

		return Response.ok().entity(view).build();
	}

}
