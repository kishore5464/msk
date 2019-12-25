package com.msk.automobiles.util;

//import org.glassfish.jersey.filter.LoggingFilter;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.mvc.jsp.JspMvcFeature;
import org.springframework.integration.handler.LoggingHandler;

public class CustomResourceConfig extends ResourceConfig {
	public CustomResourceConfig() {
		packages("com.msk.automobiles.service.controller");
		register(LoggingHandler.class);
		register(JspMvcFeature.class);
		property(JspMvcFeature.TEMPLATE_BASE_PATH, "/WEB-INF/pages");
	}
}