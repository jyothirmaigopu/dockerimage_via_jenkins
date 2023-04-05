
package com.hyderabad.Lingampalli.Controller;

import java.time.LocalDateTime;
import java.time.ZoneId;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class TimeService {
	@Scheduled(cron = "*/15 * * * * *")
	public String getEST() {
		LocalDateTime zonedEasternTime = LocalDateTime.now(ZoneId.of("America/New_York"));
		System.out.println("Current US time is===>" + zonedEasternTime);
		return zonedEasternTime.toString();
	}

	@Scheduled(cron = "*/15 * * * * *")
	public String getIST() {
		LocalDateTime zonedIndianTime = LocalDateTime.now(ZoneId.of("Asia/Calcutta"));
		System.out.println("Current INDIA time is=======>" + zonedIndianTime);
		return zonedIndianTime.toString();
	}
}
