package com.endava.ticketmanagement.service;

import com.endava.ticketmanagement.model.User;
import com.endava.ticketmanagement.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> userFindAll(){
        return userRepository.findAll();
    }
}
