package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScope {

	public static void main(String[] args) {
		
		//load spring config file
		ClassPathXmlApplicationContext context = new
				ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		
		Coach alphaCoach = context.getBean("tennisCoach",Coach.class);
		
		//check if they are same
		boolean result = (theCoach == alphaCoach);
		
		//print the result
		System.out.println("\nPointing to the same object : "+result);
		
		System.out.println("\nMemmory loc for theCoach : "+theCoach);
		
		System.out.println("\nMemmory loc for alphaCoach : "+alphaCoach);
		
		//close the context
		context.close();
		

	}

}
