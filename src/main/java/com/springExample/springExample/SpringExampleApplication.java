package com.springExample.springExample;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringExampleApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("file:src/Beans.xml");
		MessageService emailObj = (MessageService) applicationContext.getBean("emailService ");
		MessageService smsObj = (MessageService) applicationContext.getBean("smsService");

		emailObj.sendMessage("Email message", "connorNotman@gmail.com");
		smsObj.sendMessage("SMS message", "07557140322");

	}
}