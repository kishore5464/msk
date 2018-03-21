package com.msk.automobiles.util;

import java.io.IOException;
import java.util.*;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.core.Cookie;
import javax.ws.rs.core.Response;

import java.util.regex.Pattern;

public class AuthorizationRequestFilter implements ContainerRequestFilter {

	@Override
	public void filter(ContainerRequestContext requestContext) throws IOException {

		Map<String, Cookie> map = null;
		String user_agent = requestContext.getHeaderString("User-Agent");
		map = requestContext.getCookies();

		if (map.get("auth_key") != null) {
			String akey = map.get("auth_key").toString();
			String[] chunks = akey.split(Pattern.quote(";"));
			String[] elements = chunks[1].split(Pattern.quote("="));
			String fin = elements[1];

			if ((fin.equals("loggedin")) || (requestContext.getMethod().equals("GET"))) {
				System.out.println("I");
			} else {
				if ((user_agent.indexOf("Mozilla") != -1) || (user_agent.indexOf("AppleWebKit") != -1)
						|| (user_agent.indexOf("Chrome") != -1) || (user_agent.indexOf("Safari") != -1)) {
					java.net.URI location = null;
					String url = "http://" + requestContext.getHeaderString("Host") + "/msk/";

					try {
						location = new java.net.URI(url);
					} catch (Exception e) {
					}

					requestContext.abortWith(Response.seeOther(location).build());
				}

			} // else

		} // if(auth_key!=null)

		else {
			if ((user_agent.indexOf("Mozilla") != -1) || (user_agent.indexOf("AppleWebKit") != -1)
					|| (user_agent.indexOf("Chrome") != -1) || (user_agent.indexOf("Safari") != -1)) {
				java.net.URI location = null;
				String url = "http://" + requestContext.getHeaderString("Host") + "/msk/";

				System.out.println("URL ----> " + url);
				try {
					location = new java.net.URI(url);
				} catch (Exception e) {
				}

				requestContext.abortWith(Response.seeOther(location).build());
			}

		} // else

	}// filter()

}// class AuthorizationRequestFilter