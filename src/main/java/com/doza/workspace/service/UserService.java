package com.doza.workspace.service;

import com.doza.workspace.model.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    User findById(int theId);

    User save(User theUser);

    void deleteById(int theId);

}
