package com.diva.filter.demo.customFilters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class AbstractFilter implements Filter{

	   /** Initialize any global variable.
		*  @param filterConfig FilterConfig
		*  @throws ServletException Exception
		*/
		public void init(FilterConfig filterConfig) throws ServletException {
		
		}
		
		@Override
		public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
				throws IOException, ServletException {
	        HttpServletRequest httpServletRequest = (HttpServletRequest)request;
	        HttpServletResponse httpServletResponse = (HttpServletResponse)response;
	        modifyRequest(httpServletRequest, httpServletResponse);
	        chain.doFilter(httpServletRequest, httpServletResponse);
	        modifyResponse(httpServletRequest, httpServletResponse);
		}
		
		/**
		 * This method used to modify the request before it actually calling the controller.
		 * @param servletRequest  the request
		 * @param servletResponse the response
		 * @throws Exception if any expection occured
		 */
		public abstract void modifyRequest(ServletRequest request, ServletResponse response);
		
		
		/**
		 * This method returns the modified response after filtering the necessary data.
		 * @param servletRequest  the request
		 * @param servletResponse the response
		 * @throws Exception if any expection occured
		 */
		public abstract void modifyResponse(ServletRequest request, ServletResponse response);
	}

