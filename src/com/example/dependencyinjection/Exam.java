package com.example.dependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student stud1 = context.getBean("student" , Student.class);
		stud1.displayStudentInfo();

		// Student stud2 = context.getBean("student2" , Student.class);
		// stud2.displayStudentInfo();

		Student stud3 = context.getBean("student3" , Student.class);
		stud3.displayStudentInfo();

	}
}
