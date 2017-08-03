package com.programmingshifts.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FinalTest {

	public static void main(String[] args) 
	{
		
		ApplicationContext context=new ClassPathXmlApplicationContext("SpringApplicationConfig.xml");
		Taj  hoteltaj=(Taj) context.getBean("Tajbean");
		
		hoteltaj.displayStaffNames();

	}

}
