package com.msk.automobiles.service.controller;

import javax.ws.rs.Path;

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
public class UpdateController {

	// HERE I WROTE SERVLET FOR UPDATE BRAND, MODEL, PARTS, CUSTOMER DETAILS

	@Autowired
	Get_Business_Interface get_Business_Interface;

	@Autowired
	Insert_Business_Interface insert_Business_Interface;

	@Autowired
	Update_Business_Interface update_Business_Interface;

	/*@PUT
	@Path("/update-customer-detail")
	public Response add_customer_detail(@FormParam("model_id") String model_id,
			@FormParam("first_name") String first_name, @FormParam("last_name") String last_name,
			@FormParam("mobile") String mobile, @FormParam("email") String email, @FormParam("dob") String dob,
			@FormParam("registration_no") String registration_no, @FormParam("gst_no") String gst_no,
			@FormParam("customer_id") String customer_id, @FormParam("address_line_1") String address_line_1,
			@FormParam("address_line_2") String address_line_2, @FormParam("location_id") String location_id,
			@FormParam("pincode") String pincode, @Context HttpServletRequest request) {
		JSONObject mix = new JSONObject();
		JSONObject data = new JSONObject();

		try {
			// data
		} catch (Exception e) {
			throw new CustomGenericException("" + e.hashCode(), e.getMessage());
		}

		return Response.ok().entity(mix.toString()).build();
	}

	@PUT
	@Path("/update-password")
	public Response update_password(@FormParam("username") String username, @FormParam("password") String password,
			@Context HttpServletRequest request) {
		String status = null;

		try {
			update_Business_Interface.updateMSKOwnerPassword(username, password);
			status = "success";
		} catch (Exception e) {
			throw new CustomGenericException("" + e.hashCode(), e.getMessage());
		}

		return Response.ok().entity(status).build();
	}

	@PUT
	@Path("/update-invoice")
	public Response update_invoice(@FormParam("username") String username, @FormParam("password") String password,
			@Context HttpServletRequest request) {
		String status = null;

		try {
			update_Business_Interface.updateMSKOwnerPassword(username, password);
			status = "success";
		} catch (Exception e) {
			throw new CustomGenericException("" + e.hashCode(), e.getMessage());
		}

		return Response.ok().entity(status).build();
	}*/

}
