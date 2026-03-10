package com.basic.myspringboot.controller;

import com.basic.myspringboot.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class UserRestController {
    private UserRepository userRepository;

    //Constructor Injection
    public UserRestController(UserRepository userRepository) {
        log.info("UserRepository 구현 클래스명 = {}",userRepository.getClass().getName());
        this.userRepository = userRepository;
    }
}
