package com.bananastudios.crudsql.sqlcruddemo.dao;

import com.bananastudios.crudsql.sqlcruddemo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDAOImpl implements StudentDAO {
    private EntityManager _entityManager;

    @Autowired
    StudentDAOImpl(
            EntityManager entityManager
    ) {
        this._entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Student student) {
        _entityManager.persist(student);
    }
}
