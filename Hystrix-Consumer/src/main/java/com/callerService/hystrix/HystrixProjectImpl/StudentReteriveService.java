package com.callerService.hystrix.HystrixProjectImpl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;




import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

//Here this service will call the studentDetailsService using the rest Template call and will get the data in the format of response

@Service
public class StudentReteriveService {
  
	
	static Logger logger = Logger.getLogger(StudentReteriveService.class.getName());
    
	
	@Autowired
	RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod="getStudentDetailsFallBack", commandKey="StudentInfo")
	public String getDetailsFromStudentDataService(String schoolName)
	
	{
		
		
		logger.info("Inside the Retrieval Service");
		String response=restTemplate.exchange("http://localhost:9990/getStudentDetailsForSchool/{schoolname}", HttpMethod.GET, null, new ParameterizedTypeReference<String>() {
		} ,schoolName).getBody();
		
		return response;
	}
	
	
	//fallbackMethod
	
	public String getStudentDetailsFallBack( String schoolName)
	{
		
		
		logger.info("Inside the Fallback Service");
		return "Service is down for maintenan.. Please try againg at some point later!!";
		
	}
	
	
	 @Bean
	    public RestTemplate restTemplate() {
	        return new RestTemplate();
	    }
	
}
