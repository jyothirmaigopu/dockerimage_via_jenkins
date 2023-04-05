package com.hyderabad.Lingampalli.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/time")
public class TimeController {

	@Autowired
	TimeService timeService;
	
	@GetMapping("/getIST")
	public String getIst() {
		return timeService.getIST();
	}

	@GetMapping("/getEST")
	public String getEst() {
		return timeService.getEST();
	}

}
