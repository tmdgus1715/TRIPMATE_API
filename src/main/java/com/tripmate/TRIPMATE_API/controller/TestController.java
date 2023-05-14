package com.tripmate.TRIPMATE_API.controller;

import com.tripmate.TRIPMATE_API.model.User;
import com.tripmate.TRIPMATE_API.service.TestService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class TestController {
    private final TestService testService;

    @GetMapping("/users")
    void getAllUser() {
        List<User> allUser = testService.getAllUser();
        allUser.forEach(i -> System.out.println(i.toString()));
    }
}
