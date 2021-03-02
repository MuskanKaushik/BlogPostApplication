package com.upgrad.BlogPostApplication.service;

import com.upgrad.BlogPostApplication.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    //Contain all the business logic and communication
    public boolean login(User user){
        if(user.getUsername().equals("muskan_kaushik") && user.getPassword().equals("chitkara"))
            return true;
        else
            return false;

    }
}
