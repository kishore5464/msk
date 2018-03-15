package com.msk.automobiles.util;

import org.glassfish.jersey.filter.LoggingFilter;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.mvc.jsp.JspMvcFeature;


public class CustomResourceConfig extends ResourceConfig 
{
    public CustomResourceConfig() {
        packages("com.msk.automobiles.service.controller");
        register(LoggingFilter.class);
        register(JspMvcFeature.class);
        //register(AuthorizationRequestFilter.class);
        // it may be also jersey.config.server.mvc.templateBasePath
        property(JspMvcFeature.TEMPLATE_BASE_PATH, "/WEB-INF/pages");
        // ... more properties as needed ...
    }
}