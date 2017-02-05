package com.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.dao.ReadEmailAddress;
import com.manager.EmailManager;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.log4j.Logger;

public class MainApp {
	final static Logger logger = Logger.getLogger(MainApp.class);
	public static void main(String[] args) {
		logger.info("Initializing bean");
	ApplicationContext context = 
            new ClassPathXmlApplicationContext("resources/ApplicationContext.xml");

	/*PropertiesConfiguration s1 = (PropertiesConfiguration) context.getBean("simpleConfig");
     System.out.print(s1.getString("application.name"));*/
	ReadEmailAddress s1 = (ReadEmailAddress) context.getBean("readEmail");
	s1.saveEmail(2, "Test@gmail.com");
	
	}
}
