package com.example.sbeans;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ReportGenerator {
	@Scheduled(cron="0 7 8 9 * *")
	public void generator() {
		//System.out.println("welcome");
		System.err.println("joining date::"+new Date());
	}

}
