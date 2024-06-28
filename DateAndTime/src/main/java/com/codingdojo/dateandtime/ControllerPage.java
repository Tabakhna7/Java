package com.codingdojo.dateandtime;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerPage {

	@RequestMapping("/")
	public String date() {
		
		return "date.jsp";
	}
	@RequestMapping("/date")
	public String showDate() {
		
		return "datepage.jsp";
		
	}
	@RequestMapping("/time")
	public String showTime() {
		
		return "time.jsp";
		
	}
}
