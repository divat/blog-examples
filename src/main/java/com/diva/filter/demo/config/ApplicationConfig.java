package com.diva.filter.demo.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.diva.filter.demo.customFilters.MyCustomFilter;


@Configuration
public class ApplicationConfig {

	@Bean
	public FilterRegistrationBean<MyCustomFilter> registrationBean(){
		FilterRegistrationBean<MyCustomFilter> regBean = new FilterRegistrationBean<MyCustomFilter>();
		MyCustomFilter customFilter = new MyCustomFilter();
		
		regBean.setFilter(customFilter);
		regBean.addUrlPatterns("/api/*");
		regBean.setOrder(1);
		
		return regBean;
	}
}
