package com.hadil.users;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.hadil.users.entities.Role;
import com.hadil.users.entities.User;
import com.hadil.users.service.UserService;
import com.hadil.users.service.UserServiceImpl;

@SpringBootApplication
public class UsersMicroserviceApplication {

	@Autowired
	UserService userService ;

	public static void main(String[] args) {
		SpringApplication.run(UsersMicroserviceApplication.class, args);
	}

	/*
	@PostConstruct
	void init_users() {
		
		// ajouter les rôles
		userService.addRole(new Role(null, "ADMIN"));
		userService.addRole(new Role(null, "USER"));
		// ajouter les users
		userService.saveUser(new User(null, "admin", "123", true, null));
		userService.saveUser(new User(null, "nadhem", "123", true, null));
		userService.saveUser(new User(null, "yassine", "123", true, null));
		*/
		// ajouter les rôles aux users
		/*userService.addRoleToUser("admin", "ADMIN");
		userService.addRoleToUser("admin", "USER");
		userService.addRoleToUser("nadhem", "USER");
	
		userService.saveUser(new User(null, "hadil", "123", true, null));
		userService.addRoleToUser("hadil", "USER");
	}
*/
	@Bean
	BCryptPasswordEncoder getBCE() {
		return new BCryptPasswordEncoder();
	}

}
