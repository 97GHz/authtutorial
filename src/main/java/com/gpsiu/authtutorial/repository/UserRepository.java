package com.gpsiu.authtutorial.repository;

import com.gpsiu.authtutorial.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
