package com.oxygen.restservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.oxygen.restservices.model.UserDetails;

//Controller
@RestController
public class HelloWorldController {

	//@RequestMapping(method=RequestMethod.GET,path="/helloworld")
	@GetMapping("/helloworld1")
	public String helloWorld() {
		return "Hello World1";
	}
	@GetMapping("/helloworld-bean")
	public UserDetails helloWorldBean() {
		return new UserDetails("Subhranshu","Pujari","Bangalore");
	}
}
