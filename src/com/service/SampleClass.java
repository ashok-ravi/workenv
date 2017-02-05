package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component ("sampleClass")
public class SampleClass {
	
	   @Value("Hello")
	   private String message;
	   @Autowired
	   Calculator calc;

	   public void setMessage(String message){
	      this.message  = message;
	   }
	   
	   public void setCalc(Calculator calc)
	   {
		   this.calc  = calc;
	   }

	   public void getMessage(){
	      System.out.println("Your Message : " + message);
	      calc.add();
	      System.out.println(calc.getCarList());
	   }
	   public void init()
	   {
		   System.out.println("Init method invoked");
	   }
	   public void destroy()
	   {
		   System.out.println("Destroy method invoked");
	   }
}
