package com.codingdojo.HelloHuman;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Controller {
	@RequestMapping("/")
	public String render1(@RequestParam(value="firstName",required=false)String firstName,@RequestParam(value="lastName", required=false)String lastName,Model model) {
		 if ( firstName== null) {
			 
			 return "Hello Human"; 
		 }
		 
		 else if (lastName==null) {
			 
			 return "Hello" + firstName;
		 }
		 else {
			 return "None";
		 }
	}
	


}
