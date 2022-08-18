package com.seleniumexpresss.college;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);

		College college = context.getBean("colege", College.class);
		System.out.println("The college object created by spring is : " + college);

		college.test();

		((AnnotationConfigApplicationContext) context).close();
	}

}
