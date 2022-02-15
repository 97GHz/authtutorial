package com.gpsiu.authtutorial.service;

import com.gpsiu.authtutorial.domain.Role;
import com.gpsiu.authtutorial.domain.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String rolename);
    User getUser(String username);
    List<User> getUsers();
}
