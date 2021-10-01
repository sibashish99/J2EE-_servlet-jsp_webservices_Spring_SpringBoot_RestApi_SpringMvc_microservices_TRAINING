package com.example.demo.exception.handler;

import java.time.LocalDateTime;

import javax.jws.WebResult;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import com.example.demo.error.handler.ErrorHandler;

@RestControllerAdvice
public class MyExceptionHandler {
   @ExceptionHandler(Exception.class)
   public ErrorHandler handleAllException(Exception ex, WebRequest req) {
	   return new ErrorHandler(LocalDateTime.now(), ex.getMessage() , req.getDescription(false));
   }
}
