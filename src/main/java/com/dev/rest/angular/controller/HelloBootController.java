package com.dev.rest.angular.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.dev.rest.angular.model.HelloBoot;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class HelloBootController {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	//}
	@GetMapping(value ="/hello")
	String Helloboot() {
		return "HI springboot";
	}
	
   @GetMapping(value ="/helloboot")
   public HelloBoot bootmessage() {
		
		return new HelloBoot("welcome to springboot toolsuite");
				
	}
     
	  @GetMapping(value ="/helloboot/{name}")
	   public HelloBoot bootmessage(@PathVariable String name) {
			
	   
		  return new HelloBoot("welcome to springboot toolsuite with pathvariable " +  name);
					
		}
}
