package com.msk.automobiles.util;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		//
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		try {
			String url = null;
			String queryString = "";
			String host = null;

			String protocol = null;

			if (request instanceof HttpServletRequest) {
				HttpServletRequest httprequest = (HttpServletRequest) request;
				url = httprequest.getRequestURL().toString();
				queryString = ((HttpServletRequest) request).getQueryString();

				host = httprequest.getHeader("Host");
				protocol = httprequest.getScheme();

			} // if

			String str = url;
			System.out.println("LLLLLlllllllll " + url);
			str = str + "/";
			System.out.println("KKKKKkkkkkkkkk " + str);
			Pattern pattern = Pattern.compile(host + "/(.*?)/");
			Matcher matcher = pattern.matcher(str);

			matcher.find();
			String directory = matcher.group(1);

			if ((!directory.equals("scout")) && (!directory.equals("images")) && (!directory.equals("css"))
					&& (!directory.equals("fonts")) && (!directory.equals("js")) && (!directory.equals("WEB-INF"))) {
				HttpServletResponse httpResponse = (HttpServletResponse) response;

				if (queryString != null)
					httpResponse.sendRedirect(protocol + "://" + host + "/msk/" + directory + "?" + queryString);
				else
					httpResponse.sendRedirect(protocol + "://" + host + "/msk/" + directory);
			}

			else
				chain.doFilter(request, response);

		} // try
		catch (Exception ex) {
			request.setAttribute("errorMessage", ex);
			request.getRequestDispatcher("/WEB-INF/pages/404.jsp").forward(request, response);

		} // catch

	}// doFilter()

	@Override
	public void destroy() {
	}

}// class ServletFilter
