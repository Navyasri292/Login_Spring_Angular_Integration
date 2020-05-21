package com.cg.pms.exception;

import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
	public class GlobalExceptionHandler {

		@ExceptionHandler(UserdetailsException.class)
		public @ResponseBody ResponseEntity<Errorinfo>  handleException(UserdetailsException ex,HttpServletRequest req)
		{
			
			 String message=ex.getMessage();
			 String uri= req.getRequestURI();
			 
			 Errorinfo  obj = new Errorinfo(LocalDateTime.now(),message,uri);
			 ResponseEntity<Errorinfo>  re = new ResponseEntity<Errorinfo>(obj,HttpStatus.NOT_FOUND);
			 return re;
		}
	}





