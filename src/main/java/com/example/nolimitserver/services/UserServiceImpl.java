package com.example.nolimitserver.services;

import com.example.nolimitserver.entities.User;
import com.example.nolimitserver.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public String addUser(User user) {
        userRepository.save(user);
        return "Subscribed";
    }
}
