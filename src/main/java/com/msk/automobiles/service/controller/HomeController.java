package com.msk.automobiles.service.controller;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.server.mvc.Viewable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;

import com.msk.automobiles.business.interfaces.Get_Business_Interface;
import com.msk.automobiles.business.interfaces.Insert_Business_Interface;
import com.msk.automobiles.business.interfaces.Update_Business_Interface;
import com.msk.automobiles.exception.CustomGenericException;
import com.msk.automobiles.util.UtilityClass;

import net.minidev.json.JSONObject;

@Configuration
@PropertySource("classpath:/application_path.properties")
@Controller
@Path("/")
@SuppressWarnings("deprecation")
public class HomeController {

	@Autowired
	Get_Business_Interface get_Business_Interface;

	@Autowired
	Insert_Business_Interface insert_Business_Interface;

	@Autowired
	Update_Business_Interface update_Business_Interface;

	@Autowired
	UtilityClass util;

	@Autowired
	Environment env;

	@GET
	@Path("/")
	public Viewable index() {
		return new Viewable("/index");
	}

	@GET
	@Path("/login")
	public Viewable login() {
		return new Viewable("/login");
	}

	@GET
	@Path("/customer_details")
	public Viewable customer_details() {
		return new Viewable("/customer_details");
	}

	@POST
	@Path("/login")
	public Response login_cred(@FormParam("username") String username, @FormParam("password") String password,
			/* @FormParam("page_type") String page_type, */ @Context HttpServletRequest request) {
		String user_agent = request.getHeader("User-Agent");

		JSONObject applicationStateJson = new JSONObject();

		JSONObject mix = new JSONObject();

		Viewable view = null;
		String status = null;

		try {
			String page_type = "invoice";

			String msk_Owner = get_Business_Interface.getMSKOwnerDetail(username, password);

			if (msk_Owner.equals("success")) {
				status = "success";

				mix.put("status", status);

				if (page_type.equals("invoice")) {
					if ((user_agent.indexOf("Mozilla") != -1) || (user_agent.indexOf("AppleWebKit") != -1)
							|| (user_agent.indexOf("Chrome") != -1) || (user_agent.indexOf("Safari") != -1)) {
						String url = request.getScheme() + "://" + request.getHeader("Host") + ""
								+ env.getProperty("msk.host.url") + "customer-detail";
						String urlParameters = java.net.URLEncoder.encode(applicationStateJson.toString());
						String htmlResponse = util.postRedirect(url, urlParameters);
						return Response.status(200).entity(htmlResponse).type(MediaType.TEXT_HTML_TYPE).build();
					}
				} else {
					if ((user_agent.indexOf("Mozilla") != -1) || (user_agent.indexOf("AppleWebKit") != -1)
							|| (user_agent.indexOf("Chrome") != -1) || (user_agent.indexOf("Safari") != -1)) {
						String url = request.getScheme() + "://" + request.getHeader("Host") + ""
								+ env.getProperty("msk.host.url") + "spare-parts";
						String urlParameters = java.net.URLEncoder.encode(applicationStateJson.toString());
						String htmlResponse = util.postRedirect(url, urlParameters);
						return Response.status(200).entity(htmlResponse).type(MediaType.TEXT_HTML_TYPE).build();
					}
				}

			} else {
				status = "failure";
				mix.put("status", status);

				view = new Viewable("/login.jsp", mix);
			}
		} catch (Exception e) {
			throw new CustomGenericException("" + e.hashCode(), e.getMessage());
		}

		return Response.ok().entity(view).build();
	}

}