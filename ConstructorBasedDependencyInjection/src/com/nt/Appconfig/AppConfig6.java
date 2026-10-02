package com.nt.Appconfig;


import org.springframework.context.annotation.Bean;

import com.nt.day1.sbeans.EmailService;
import com.nt.day1.sbeans.NotificationService;
import com.nt.day1.sbeans.SMSService;
import com.nt.day1.sbeans.WhatsAppService;

public class AppConfig6 {
	@Bean("ee")
	public EmailService service() {
		return new EmailService();
	}
	@Bean("ss")
  public SMSService sms() {
	  return new SMSService();
  }
	@Bean("ww")
	public WhatsAppService wht() {
		return new WhatsAppService();
	}
	@Bean("nn")
	public NotificationService no() {
		return new NotificationService();
	}
}
