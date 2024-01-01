package com.mywalletdatabase.mywalletdatabase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Statistics {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/test")
    public int test(){
        return 1;
    }

    @GetMapping("/user")

    public List<User> getAll(){
        return userRepository.getAll();
    }


}
