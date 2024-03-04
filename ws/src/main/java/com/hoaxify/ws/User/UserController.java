package com.hoaxify.ws.User;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @CrossOrigin
    @PostMapping("api/v1/user")
    void createUser(){

    }
}
