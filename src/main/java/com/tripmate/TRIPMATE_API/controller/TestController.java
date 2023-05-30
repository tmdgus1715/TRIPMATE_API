package com.tripmate.TRIPMATE_API.controller;

import com.tripmate.TRIPMATE_API.model.domain.User;
import com.tripmate.TRIPMATE_API.service.TestService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class TestController {
    private final TestService testService;

    @GetMapping("/users")
    List<User> getAllUser() {
        List<User> allUser = testService.getAllUser();
        allUser.forEach(i -> System.out.println(i.toString()));
        return allUser;
    }

    @GetMapping("/user/{id}")
    void getUser(@PathVariable int id) {
        User user = testService.getUser(id);
        System.out.println(user.toString());
    }

    @PostMapping("/users/sign_in")
    void register(@RequestBody User newUser) {
        testService.createUser(newUser);
    }
}
