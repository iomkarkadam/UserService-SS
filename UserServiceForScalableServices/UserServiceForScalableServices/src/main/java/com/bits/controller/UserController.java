package com.bits.controller;


import com.bits.entity.User;
import com.bits.model.UserDTO;
import com.bits.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@CrossOrigin
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/{userId}")
    public UserDTO getUserDetailsById(@PathVariable String userId){
        return userService.getUserDetailsById(userId);
    }

    @PostMapping
    private String registerUser(@RequestBody UserDTO user){

        System.out.println(user.toString());
        return userService.registerUser(user);
    }
}