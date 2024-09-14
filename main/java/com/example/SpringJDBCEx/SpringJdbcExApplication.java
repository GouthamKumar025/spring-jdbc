package com.example.SpringJDBCEx;

import com.example.SpringJDBCEx.model.Student;
import com.example.SpringJDBCEx.service.StudentServices;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJdbcExApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringJdbcExApplication.class, args);

		Student s = context.getBean(Student.class);

		s.setRollno(4);
		s.setName("Goutham");
		s.setMarks(95);

		StudentServices ss = context.getBean(StudentServices.class);
		ss.addStudent(s);
	}

}
