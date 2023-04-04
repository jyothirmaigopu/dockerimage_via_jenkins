package com.hyderabad.Lingampalli.Controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class Lingampalli {
	
	@Autowired
	US_times ust;
	
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

	@Scheduled(cron="*/10 * * * * *")
	@GetMapping("/getIST")
    public String getIst() {
        // this will execute on weekdays
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
		return localDateTime.toString();
    }
	
	@Scheduled(cron="*/10 * * * * *")
	@GetMapping("/getEST")
    public String getEst() {
        // this will execute on weekdays
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
		return ust.getEST();
    }
	

}
