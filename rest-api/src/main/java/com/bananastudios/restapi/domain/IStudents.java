package com.bananastudios.restapi.domain;

import com.bananastudios.restapi.domain.entities.Student;

import java.util.List;

public interface IStudents {
    Student getStudentById(int id);

    List<Student> getAllStudents();

    Student updateStudent(Student student);

    Student setUpdate(Student student);

    Student deleteStudent(Student student);
}
