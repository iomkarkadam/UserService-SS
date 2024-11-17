package com.bits.service;

import com.bits.entity.User;
import com.bits.model.UserDTO;
import com.bits.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;

    public UserDTO getUserDetailsById(String userId){
        return new UserDTO();
    }

    public String registerUser(User user){
        User userr=  userRepo.save(user);
        if(userr!= null){
            return "user registered successfully!";
        }
        return "";
    }
}
