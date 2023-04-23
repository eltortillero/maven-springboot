package com.bananastudios.crudsql.sqlcruddemo.dao;

import com.bananastudios.crudsql.sqlcruddemo.entity.Student;

import java.util.List;

public interface StudentDAO {
    void save(Student student);

    void update(Student student);

    void delete(int id);

    int deleteAll();

    Student findById(int id);

    List<Student> findByLastName(String lastName);

    List<Student> findAll();
}
