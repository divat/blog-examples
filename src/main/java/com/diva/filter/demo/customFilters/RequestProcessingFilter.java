package com.diva.filter.demo.customFilters;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Component
@Order(Ordered.HIGHEST_PRECEDENCE) //Setting the invocation order
public class RequestProcessingFilter extends AbstractFilter{

	@Override
	public void modifyRequest(ServletRequest request, ServletResponse response) {
		String ipAddress = request.getRemoteAddr();
		System.out.println("Requested user IP address is :: " +ipAddress);
	}

	@Override
	public void modifyResponse(ServletRequest request, ServletResponse response) {
		
	}
	
	/**
	* Called by the web container when the filter instance is not in use.
	**/
	public void destroy() {
		
	}

}
