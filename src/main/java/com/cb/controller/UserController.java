package com.cb.controller;

import com.cb.model.User;
import com.cb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/", consumes = "application/json")
    public String create(@RequestBody User user) {
        userService.saveUser(user);
        return "Done !!!";
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    public User retrieve(@PathVariable String id) {
        return userService.getUser(id);
    }
}
