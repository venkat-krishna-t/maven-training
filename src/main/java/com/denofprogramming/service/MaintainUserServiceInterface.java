package com.denofprogramming.service;

import com.denofprogramming.model.User;

public interface MaintainUserServiceInterface {

	void updateName(final String name);
	
	void updateAge(final int age);
	
	
	User readUser(final Long id);

}