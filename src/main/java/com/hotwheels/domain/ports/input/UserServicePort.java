package com.hotwheels.domain.ports.input;

import com.hotwheels.domain.model.User;

import java.util.List;
import java.util.Optional;

public interface UserServicePort {
    User createUser(User user);
    Optional<User> getUserById(Long id);
    Optional<User> getUserByUsername(String username);
    List<User> getAllUsers();
    User updateUser(Long id, User user);
    void deleteUser(Long id);
}