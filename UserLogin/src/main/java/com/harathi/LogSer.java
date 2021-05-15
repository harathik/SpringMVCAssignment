package com.harathi;

import org.springframework.stereotype.Service;

@Service
public class LogSer {
	public boolean validateUser(String user, String password) {
		return user.equalsIgnoreCase("harathi") && password.equals("password");
	}

}