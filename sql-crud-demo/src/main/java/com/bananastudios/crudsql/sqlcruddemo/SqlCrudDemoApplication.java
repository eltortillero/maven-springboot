package com.bananastudios.crudsql.sqlcruddemo;

import com.bananastudios.crudsql.sqlcruddemo.dao.StudentDAO;
import com.bananastudios.crudsql.sqlcruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class SqlCrudDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SqlCrudDemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
        return runner -> {
//            final var student = retrieveStudentById(studentDAO, 2);
//            System.out.println(student.toString());
            final var students = findAllStudents(studentDAO);
            for (Student student : students) {
                System.out.println(student.toString());
            }
        };
    }

    private void createStudent(StudentDAO studentDAO) {
        System.out.println("Creating new student");
        Student tempStudent = new Student("Misael", "Gastelum", "xqwz@live.com");
        studentDAO.save(tempStudent);
        System.out.println("Saved student" + tempStudent.getId());
    }

    public Student retrieveStudentById(StudentDAO studentDAO, int id) {
        return studentDAO.findById(id);
    }

    public List<Student> findAllStudents(StudentDAO studentDAO) {
        return studentDAO.findAll();
    }

}
