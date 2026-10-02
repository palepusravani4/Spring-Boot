package com.example.ExceptonHandling;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
@RestControllerAdvice
public class TouristErrorHandler {
	@ExceptionHandler(TouristNotFoundException.class)
	public ResponseEntity<ErrorDetails> handleTouristNotFound(TouristNotFoundException tt){
		System.out.println("TouristErrorHandler.handleTouristNotFound()");
		ErrorDetails details=new ErrorDetails(LocalDateTime.now(),tt.getMessage(),"404-Tourist Not Found");
		return new ResponseEntity<ErrorDetails>(details,HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorDetails> handleAllProblems(Exception e){
		System.out.println("TouristErrorHandler.handleAllProblems()");
		ErrorDetails details=new ErrorDetails(LocalDateTime.now(),e.getMessage(),"problem in execution");
		return new ResponseEntity<ErrorDetails>(details,HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
