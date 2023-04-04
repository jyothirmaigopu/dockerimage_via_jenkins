
package com.hyderabad.Lingampalli.Controller;

import java.time.ZoneId;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class US_times {
	@Scheduled(cron="* * * * * *")
    public String getEST() {
        // this will execute on weekdays
	//	ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.systemDefault());
		ZoneId zonedEasternTime = ZoneId.of("America/New_York");
		System.out.println("Curent US time from component is===>"+zonedEasternTime);
		return zonedEasternTime.toString();  
    }
}
