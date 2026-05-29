package com.Madhumitha.WebProject.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Madhumitha.WebProject.model.User;
import com.Madhumitha.WebProject.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

    public UserService userService;

    public UserController() {
        userService = new UserService();
    }

    @GetMapping
    public ResponseEntity<List<User>> getAll() {
        return ResponseEntity.ok(userService.getAllUser());
    }
}
