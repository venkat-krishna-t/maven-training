package com.denofprogramming;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.denofprogramming.config.AppConfig;
import com.denofprogramming.model.User;
import com.denofprogramming.service.MaintainUserServiceInterface;

public class ClientUsingJavaConfig {

	public static void main(final String[] args) {

		// configuration part
		try (final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)) {
			context.registerShutdownHook();

			final MaintainUserServiceInterface userService = context.getBean("maintainUser",MaintainUserServiceInterface.class);

			final User user = userService.readUser(Long.valueOf("999"));
			System.out.println("Found user: " + user);
			
		} catch (final Exception ex) {
			ex.printStackTrace();
		}
	}
}
