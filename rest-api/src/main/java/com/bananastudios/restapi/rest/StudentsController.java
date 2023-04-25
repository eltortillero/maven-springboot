package com.bananastudios.restapi.rest;

import com.bananastudios.restapi.domain.IStudents;
import com.bananastudios.restapi.domain.entities.Student;
import com.bananastudios.restapi.domain.entities.StudentErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentsController implements IStudents {
    private List<Student> studentsList = List.of(
            new Student("Horeb", "Gastelum", 0),
            new Student("Horeb", "Miramontes", 1)
    );

    @Override
    @GetMapping("get-student/{id}")
    public Student getStudentById(
            @PathVariable int id
    ) {
        if ((id >= this.studentsList.size()) || (id < 0)) {
            throw new StudentNotFoundException("Student id not found - " + id);
        }
        return this.studentsList.get(id);
    }

    @Override
    @GetMapping("all-students")
    public List<Student> getAllStudents() {
        return this.studentsList;
    }

    @Override
    public Student updateStudent(Student student) {
        return null;
    }

    @Override
    public Student setUpdate(Student student) {
        return null;
    }

    @Override
    public Student deleteStudent(Student student) {
        return null;
    }

    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException exception) {
        StudentErrorResponse error = new StudentErrorResponse(HttpStatus.NOT_FOUND.value(), exception.getMessage(), System.currentTimeMillis());
        return new ResponseEntity<StudentErrorResponse>(error, HttpStatus.NOT_FOUND);
    }
}
