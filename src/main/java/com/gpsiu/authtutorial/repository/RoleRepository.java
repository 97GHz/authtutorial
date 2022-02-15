package com.gpsiu.authtutorial.repository;

import com.gpsiu.authtutorial.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}