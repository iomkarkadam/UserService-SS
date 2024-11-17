package com.bits.service;

import com.bits.entity.User;
import com.bits.model.UserDTO;
import com.bits.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;

    public UserDTO getUserDetailsById(String userId){

        Optional<User> user= userRepo.findById(Long.valueOf(userId));
        User user1= user.get();
        UserDTO userDTO= new UserDTO(user1.getUserName(), user1.getPincode());
        return userDTO;
    }

    public String registerUser(UserDTO user){
        User userdetails= new User();
        userdetails.setPincode(user.getPincode());
        userdetails.setUserName(user.getUserName());
        User userr=  userRepo.save(userdetails);
        if(userr!= null){
            return "user registered successfully!";
        }
        return "";
    }
}
