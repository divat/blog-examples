package com.diva.filter.demo.customFilters;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyCustomFilter extends AbstractFilter {

	@Override
	public void modifyRequest(ServletRequest request, ServletResponse response) {
		System.out.println("Before processing the request");
	}

	@Override
	public void modifyResponse(ServletRequest request, ServletResponse response) {
		System.out.println("Before sending the response to client");
	}
	
	public void destroy() {
		//do some cleanup
	}

}
