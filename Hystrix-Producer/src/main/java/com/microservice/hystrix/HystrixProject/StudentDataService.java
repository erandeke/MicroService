package com.microservice.hystrix.HystrixProject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StudentDataService {
	
	
	

	private static Map<String,List<StudentData>> studData=new HashMap<String,List<StudentData>>();
	
	
	static
	{
		studData=new HashMap<String,List<StudentData>>();
		
		List<StudentData> studentList=new ArrayList<StudentData>();
		studentList.add(new StudentData("Kedar", "1st"));
		studentList.add(new StudentData("Jack", "5th"));
		studentList.add(new StudentData("Mark", "10th"));
		studData.put("ABCschool", studentList);
		
		
		 studentList=new ArrayList<StudentData>();
		studentList.add(new StudentData("Tom", "11th"));
		studentList.add(new StudentData("Dick", "11th"));
		studentList.add(new StudentData("Harry", "12th"));
		studData.put("XYZxchool", studentList);
		
		
		System.out.println("Inside static block");
		
		
		
		
		
		
	}
	 
	//Just for Test whether we are getting the list back
	@GetMapping("/getStudentDetailsForSchool/{schoolname}")
	public List<StudentData> getStudentSchoolInformation(@PathVariable String schoolname)
	{
		List<StudentData>  informative=studData.get(schoolname);
		if(informative==null)
		{
			informative=new ArrayList<StudentData>();
			informative.add(new StudentData("Not Found", "Na"));
			
		}
		
		return informative;
	}
	
	
}
