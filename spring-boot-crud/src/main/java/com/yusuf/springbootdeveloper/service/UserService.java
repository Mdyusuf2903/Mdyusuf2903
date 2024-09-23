package com.yusuf.springbootdeveloper.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yusuf.springbootdeveloper.model.User;
import com.yusuf.springbootdeveloper.repository.UserRepository;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll(); // Get all users
    }

    public User findById(Long id) {
        return userRepository.findById(id).orElse(null); // Find user by ID
    }

    public User save(User user) {
        return userRepository.save(user); // Save user
    }

    public void deleteById(Long id) {
        userRepository.deleteById(id); // Delete user by ID
    }
}