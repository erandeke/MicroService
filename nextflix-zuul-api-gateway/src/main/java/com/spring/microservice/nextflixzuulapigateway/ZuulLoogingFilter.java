package com.spring.microservice.nextflixzuulapigateway;

import javax.servlet.http.HttpServletRequest;

import org.apache.http.protocol.RequestContent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.client.http.HttpRequest;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

@Component
public class ZuulLoogingFilter extends ZuulFilter {

	
	private Logger logger=LoggerFactory.getLogger(this.getClass());
	@Override
	//This method where the business logic can be written or log --say logging filter
	public Object run() throws ZuulException {
		HttpServletRequest request=RequestContext.getCurrentContext().getRequest();
	  logger.info(" Kedar request---->{}", request.getRequestURI());
	  
		
		return null;
	}

	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		//Business logic can be implemented here to intercept the particular urls
		return true;
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		//setting the priority order 
		// say if we have multiple filter then we can set the order in this service area
		return 1;
	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		//It says when the filter should be applied before the execution of request-pre
		//post execution of request-post
		//or error logging when happens-error
		return "pre";
	}

}
