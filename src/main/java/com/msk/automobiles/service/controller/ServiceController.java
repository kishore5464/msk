package com.msk.automobiles.service.controller;

import java.io.IOException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.msk.automobiles.exception.CustomGenericException;
import com.msk.automobiles.service.pojos.Service_Parts_Pojo;

import net.minidev.json.JSONObject;

@Configuration
@PropertySource("classpath:/application_path.properties")
@Controller
@Path("/")
public class ServiceController {

	@GET
	@Path("/filter")
	public void filter() throws IOException {

		JSONObject data = new JSONObject();
		JSONObject mix = new JSONObject();

		String parts = "[{\"part_id\": \"1\",\"part\": \"Vyper\",\"amount\": \"560\",\"quantity\": \"6\"}]";

		try {
			ObjectMapper mapper = new ObjectMapper();
			String[] filterArray = parts.trim().replace("[", "").replace("]", "").replace("}, {", "};{").split(";");

			Service_Parts_Pojo service_Parts_Pojo = new Service_Parts_Pojo();

			for (int i = 0; i < filterArray.length; i++) {
				String value = filterArray[i];
				service_Parts_Pojo = mapper.readValue(value, Service_Parts_Pojo.class);
			}

			System.out.println(service_Parts_Pojo.toString());

			// data.put("filter", filterResult);
			//
			// if (!filterResult.isEmpty()) {
			// data.put("filter_size", filterResult.get(0).getFilter_size());
			//
			// }

			mix.put("data", data);
		} catch (Exception e) {
			throw new CustomGenericException("" + e.hashCode(), e.getMessage());
		}
		// return Response.ok().entity(mix.toString()).build();
	}
}