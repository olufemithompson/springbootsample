package com.lqwd.coinproject.exceptions;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.http.HttpStatus;

@RestControllerAdvice
public class ApplicationExceptionHandler {
	
	@ExceptionHandler(RecordNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	@ResponseBody
	public ErrorResponse handleNoRecordFoundException(RecordNotFoundException ex) 
	{
		
	    ErrorResponse errorResponse = new ErrorResponse();
	    errorResponse.setMessage("Could not find record");
	    return errorResponse;
	}
	
}
