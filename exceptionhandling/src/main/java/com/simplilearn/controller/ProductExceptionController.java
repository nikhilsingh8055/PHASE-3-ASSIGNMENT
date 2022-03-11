package com.simplilearn.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.simplilearn.custom.ProductNotFoundException;

        //Here we have used @ControllerAdvice to handle all exception
    @ControllerAdvice
    public class ProductExceptionController {

	//Here we have used @ExceptionHandler to handle specific exception
	@ExceptionHandler(value = ProductNotFoundException.class)
	public ResponseEntity<Object> exception(ProductNotFoundException e)
	{
		return  new ResponseEntity<Object>("Product Not found",HttpStatus.NOT_FOUND);
	}
}


