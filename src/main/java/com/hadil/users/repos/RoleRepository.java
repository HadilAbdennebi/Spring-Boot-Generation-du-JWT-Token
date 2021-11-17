package com.hadil.users.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hadil.users.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
	Role findByRole(String role);
}
