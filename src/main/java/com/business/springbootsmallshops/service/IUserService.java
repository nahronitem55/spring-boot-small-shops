package com.business.springbootsmallshops.service;

import com.business.springbootsmallshops.model.User;

import java.util.Optional;

public interface IUserService {
    User saveUser(User user);

    Optional<User> findByUsername(String username);

    void makeAdmin(String username);
}
