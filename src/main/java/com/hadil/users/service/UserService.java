package com.hadil.users.service;

import com.hadil.users.entities.Role;
import com.hadil.users.entities.User;

public interface UserService {
	User saveUser(User user);

	User findUserByUsername(String username);

	Role addRole(Role role);

	User addRoleToUser(String username, String rolename);
} 