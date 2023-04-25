package com.bananastudios.restapi.rest;

import com.bananastudios.restapi.domain.entities.StudentErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StudentRestExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException exception) {
        final var HTTP_STATUS = HttpStatus.NOT_FOUND;
        StudentErrorResponse error = new StudentErrorResponse(HTTP_STATUS.value(), exception.getMessage(), System.currentTimeMillis());
        return new ResponseEntity<StudentErrorResponse>(error, HTTP_STATUS);
    }

    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException(Exception exception) {
        final var HTTP_STATUS = HttpStatus.BAD_REQUEST;
        StudentErrorResponse error = new StudentErrorResponse(HTTP_STATUS.value(), exception.getMessage(), System.currentTimeMillis());
        return new ResponseEntity<StudentErrorResponse>(error, HTTP_STATUS);
    }
}
