package com.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.apache.log4j.Logger;

public class MainApp {
	final static Logger logger = Logger.getLogger(MainApp.class);
	public static void main(String[] args) {
		logger.info("Initializing bean");
	ApplicationContext context = 
            new ClassPathXmlApplicationContext("resources/ApplicationContext.xml");

     SampleClass s1 = (SampleClass) context.getBean("helloWorld");
     s1.getMessage();
	}
}
