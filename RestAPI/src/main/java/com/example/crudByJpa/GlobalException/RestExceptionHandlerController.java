package com.example.crudByJpa.GlobalException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class RestExceptionHandlerController {
    @ExceptionHandler
    public ResponseEntity<ExceptionDTO> errorHandler(CustomException ces){
        ExceptionDTO err=new ExceptionDTO();
        err.setStatus(HttpStatus.NOT_FOUND.value());
        err.setMessage(ces.getMessage());
        err.setTimeStamp(System.currentTimeMillis());
        return new ResponseEntity<>(err,HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<ExceptionDTO> errorHandler(Exception ces){
        ExceptionDTO err=new ExceptionDTO();
        err.setStatus(HttpStatus.NOT_FOUND.value());
        err.setMessage(ces.getMessage());
        err.setTimeStamp(System.currentTimeMillis());
        return new ResponseEntity<>(err,HttpStatus.NOT_FOUND);
    }
}
