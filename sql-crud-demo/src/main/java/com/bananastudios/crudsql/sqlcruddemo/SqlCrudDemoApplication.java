package com.bananastudios.crudsql.sqlcruddemo;

import com.bananastudios.crudsql.sqlcruddemo.dao.StudentDAO;
import com.bananastudios.crudsql.sqlcruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SqlCrudDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SqlCrudDemoApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
			createStudent(studentDAO);
		};
	}

	private void createStudent(StudentDAO studentDAO) {
		System.out.println("Creating new student");
		Student tempStudent = new Student("Misael", "Gastelum", "xqwz@live.com");
		studentDAO.save(tempStudent);
		System.out.println("Saved student" + tempStudent.getId());
	}


}
