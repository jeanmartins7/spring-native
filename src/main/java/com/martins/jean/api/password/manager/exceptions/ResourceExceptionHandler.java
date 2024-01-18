package com.martins.jean.api.password.manager.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Boolean> handlerMethodArgumentNotValidException(MethodArgumentNotValidException ex,
                                                                          HttpServletRequest request){

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(false);

    }

}
