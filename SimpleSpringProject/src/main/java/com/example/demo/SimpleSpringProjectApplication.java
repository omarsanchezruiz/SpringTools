package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.chapter1.service.GreetingMessageService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SimpleSpringProjectApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SimpleSpringProjectApplication.class, args);
		
		ApplicationContext context = new
				ClassPathXmlApplicationContext(
				"beans.xml");
		GreetingMessageService greetingMessageService =
				context.getBean(
				"greetingMessageServiceImpl",
		GreetingMessageService.class);
				System.out.println(greetingMessageService.greetUser());
	}

}
