package com.callerService.hystrix.HystrixProjectImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//school service calling the student service Internally to get the data of student based upon the school Name


@RestController
public class SchoolServiceController {

	@Autowired
	StudentReteriveService studRetrieveService;
	
	
	@GetMapping("/getStudentDetailsForSchool/{schoolname}")
	public String FetchStudentDataFromRetrieveService(@PathVariable String schoolname)
	{
	
		 return studRetrieveService.getDetailsFromStudentDataService(schoolname);
	}
}
