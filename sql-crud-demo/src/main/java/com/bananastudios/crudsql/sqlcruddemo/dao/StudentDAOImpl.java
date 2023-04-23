package com.bananastudios.crudsql.sqlcruddemo.dao;

import com.bananastudios.crudsql.sqlcruddemo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO {
    private final EntityManager _entityManager;

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

    @Override
    public Student findById(int id) {
        return _entityManager.find(Student.class, id);
    }

    @Override
    public List<Student> findAll() {
        TypedQuery<Student> query = _entityManager.createQuery("FROM Student order by lastName desc", Student.class);
        return query.getResultList();
    }

    @Override
    public List<Student> findByLastName(String lastName) {
        TypedQuery<Student> query = _entityManager.createQuery("FROM Student WHERE lastName=:lastNameParam", Student.class);
        query.setParameter("lastNameParam", lastName);
        return query.getResultList();
    }

}
