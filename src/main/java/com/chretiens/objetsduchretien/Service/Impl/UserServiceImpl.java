package com.chretiens.objetsduchretien.Service.Impl;

import com.chretiens.objetsduchretien.Service.UserService;
import com.chretiens.objetsduchretien.domain.User;
import com.chretiens.objetsduchretien.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public User add(String name) {
        User user = new User();
        user.setName(name);
        return userRepository.save(user);
    }

    @Override
    public User add(String name, Date dateInscription) {
        return null;
    }

    @Override
    public User findById(int id) {
        return userRepository.findById(id).orElse(null);
    }
}
