package com.seleniumexpresss.college;

import org.springframework.stereotype.Component;

@Component
public class ScienceTeacher implements Teacher{

	@Override
	public void teach() {
		
		System.out.println("Hi i am your ScienceTeacher");

		System.out.println("My name is dhoni");
	}

}
