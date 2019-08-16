package com.denofprogramming.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.denofprogramming.model.User;

@Service("maintainUser")
public class MaintainUserService implements MaintainUserServiceInterface {

	@Inject
	UserServiceInterface userService;
	
	@Override
	public void updateName(String name) {
		final User user = new User();
		user.setName(name);
		userService.update(user);		
	}

	@Override
	public void updateAge(int age) {
		final User user = new User();
		user.setAge(age);
		userService.update(user);		
	}

	@Override
	public User readUser(final Long id) {
		final User user = new User();
		user.setId(id);
		return userService.read(user);
	}
}
