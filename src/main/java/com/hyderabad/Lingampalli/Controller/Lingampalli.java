package com.hyderabad.Lingampalli.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class Lingampalli {
	
	@GetMapping("/flatsize")
	public String getFlatSize() {
		return "480 Square Feet";
	}
	
	@GetMapping("/bedrooms")
	public String getBedrooms() {
		return "1 Bedroom";
	}
	
	@GetMapping("/washrooms")
	public String getWashrooms() {
		return "1";
	}
	
	@GetMapping("/facing")
	public String getFacing() {
		return "South";
	}
	
	@GetMapping("/uds")
	public String getUndividedShare() {
		return "11 Square Yards";
	}
	
	@GetMapping("/iscarparkingavailable")
	public boolean isCarParkingAvailable() {
		return false;
	}

	@GetMapping("/isfullfurnished")
	public String isFullyFurnished() {
		return "YES";
	}

}
