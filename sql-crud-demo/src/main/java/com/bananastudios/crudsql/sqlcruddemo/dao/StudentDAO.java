package com.bananastudios.crudsql.sqlcruddemo.dao;

import com.bananastudios.crudsql.sqlcruddemo.entity.Student;

import java.util.List;

public interface StudentDAO {
    void save(Student student);

    Student findById(int id);

    List<Student> findAll();
}
