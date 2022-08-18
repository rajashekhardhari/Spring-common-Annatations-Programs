package com.seleniumexpresss.college;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class College {
	
	@Value("${college.Name}")
	private String collegeName;

	@Autowired
	private Principal principal;
	@Autowired
	@Qualifier("scienceTeacher")
	private Teacher teacher;

	
	@Required
	@Value("${college.Name}")
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}


	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}


	public void setPrincipal(Principal principal) {
		this.principal = principal;
		System.out.println("using setter method");
	}

	public void test() {

		principal.principalInfo();
		teacher.teach();
		System.out.println("My college name "+collegeName);
		System.out.println("The test method is calling");
	}

}
 