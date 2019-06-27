package com.springwebflow.service;

import com.springwebflow.exception.IncorrectLoginCredentialsException;
import com.springwebflow.model.LoginCredentials;

public class LoginService {
	public String performLogin(LoginCredentials loginCredentials) throws IncorrectLoginCredentialsException {
		if (loginCredentials.getLoginName() != null & loginCredentials.getLoginName().trim().equalsIgnoreCase("alba")
				& loginCredentials.getPassword() != null
				& loginCredentials.getPassword().trim().equalsIgnoreCase("pass")) {
			// user successfully logged in
			return "success";
		} else {
			throw new IncorrectLoginCredentialsException();
		}
	}
}
