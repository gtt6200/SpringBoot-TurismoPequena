package com.turismopequena.turismopequena.exceptions;

import org.springframework.http.HttpStatus;

public class NotFoundException extends DetalleException{

	public NotFoundException(String code, String message) {
		super(code,HttpStatus.NOT_FOUND.value(),message);
		// TODO Auto-generated constructor stub
	}
	
	

}
