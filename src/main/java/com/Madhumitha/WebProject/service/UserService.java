package com.Madhumitha.WebProject.service;

import java.util.ArrayList;
import java.util.List;

import com.Madhumitha.WebProject.model.User;

public class UserService {

    private List<User> allUsers;

    public UserService() {

        allUsers = new ArrayList<>();

        allUsers.add(
                new User(
                        "Ram",
                        "Male",
                        "/img/john_doe.png",
                        1));

        allUsers.add(
                new User(
                        "Madhumitha",
                        "Female",
                        "/img/jane_doe.png",
                        2));
    }

    public List<User> getAllUsers() {
        return allUsers;
    }
}