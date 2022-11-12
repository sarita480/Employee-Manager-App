package com.example.employemanager.exception;

public class UserNotFoundException extends RuntimeException
{

	public UserNotFoundException(String message) 
	{
		super(message);
	}

}
