package com.bits.controller;


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

    @GetMapping("/get")
    public UserDTO getUserDetailsById(String userId){
        return userService.getUserDetailsById(userId);
    }

    @PostMapping("/register")
    private String registerUser(){
        return "";
    }
}
