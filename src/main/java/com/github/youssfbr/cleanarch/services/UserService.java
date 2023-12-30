package com.github.youssfbr.cleanarch.services;

import com.github.youssfbr.cleanarch.models.User;
import com.github.youssfbr.cleanarch.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User create(User user) {
        return userRepository.save(user);
    }
}
