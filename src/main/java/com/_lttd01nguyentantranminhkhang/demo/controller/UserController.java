package com._lttd01nguyentantranminhkhang.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com._lttd01nguyentantranminhkhang.demo.models.User;
import com._lttd01nguyentantranminhkhang.demo.service.UserService;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<User> getAllUser() {
        return this.userService.getAllUSer();
    }

    @PostMapping("/Users")
    public User postMethodName(@RequestBody User user) {
        return this.userService.luuUser(user);

    }

}
