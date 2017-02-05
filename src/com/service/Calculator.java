package com.service;

import java.util.List;
import java.util.Map;
import java.util.Set;
import org.springframework.stereotype.Component;

@Component
public class Calculator {
	List carList;
	Set carSet;
	Map carMap;	
	
	public Calculator(List carList,Set carSet,Map carMap)
	{
		System.out.println("In constructor Calculator");
		this.carList = carList;
		this.carSet = carSet;
		this.carMap = carMap;
	}
	
	public Calculator()
	{
		
	}
	
	public void setCarList(List carList)
	{
		this.carList = carList;
	}
	
	public void setCarSet(Set carSet)
	{
		this.carSet = carSet;
	}
	
	public void setCarMap(Map carMap)
	{
		this.carMap = carMap;
	}
	
	public List getCarList()
	{
		return carList;
	}
	
	public void add()
	{
		System.out.println("In add method");
	}

}
