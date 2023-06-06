package com.tripmate.TRIPMATE_API.controller;

import com.tripmate.TRIPMATE_API.model.User;
import com.tripmate.TRIPMATE_API.model.LoginUserRequest;
import com.tripmate.TRIPMATE_API.model.UpdateUserRequest;
import com.tripmate.TRIPMATE_API.service.UserService;
import com.tripmate.TRIPMATE_API.service.JwtService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user", produces = "application/json; charset=utf8")
@AllArgsConstructor
public class UserController {
    private final UserService userService;
    private final JwtService jwtService;

    @PostMapping("/sign_up")
    ResponseEntity<Object> createUser(@RequestBody User newUser)
    {
        userService.create(newUser);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/sign_in")
    ResponseEntity<String> login(@RequestBody LoginUserRequest loginUserRequest)
    {
        String jwtToken = userService.login(loginUserRequest);
        return ResponseEntity.ok(jwtToken);
    }

    @DeleteMapping
    ResponseEntity<Object> deleteUser(String jwtToken, String password) throws Exception
    {
        Integer userId = jwtService.getUserId(jwtToken);
        userService.delete(userId, password);
        return ResponseEntity.ok().build();
    }

    @PatchMapping
    ResponseEntity<Object> updateUser(String jwtToken, @RequestBody UpdateUserRequest updateUserRequest) throws Exception
    {
        Integer userId = jwtService.getUserId(jwtToken);
        switch (updateUserRequest.getKey())
        {
            case "password":
                userService.updatePassword(userId, updateUserRequest.getValue());
                return ResponseEntity.ok().build();
            case "name":
                userService.updateName(userId, updateUserRequest.getValue());
                return ResponseEntity.ok().build();
            case "phone_number":
                userService.updatePhoneNumber(userId, updateUserRequest.getValue());
                return ResponseEntity.ok().build();
            case "nickname":
                userService.updateNickname(userId, updateUserRequest.getValue());
                return ResponseEntity.ok().build();
            case "email":
                userService.updateEmail(userId, updateUserRequest.getValue());
                return ResponseEntity.ok().build();
            case "gender":
                userService.updateGender(userId, updateUserRequest.getIntValue());
                return ResponseEntity.ok().build();
            case "brith":
                userService.updateBirth(userId, updateUserRequest.getTimestampValue());
                return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping
    ResponseEntity<User> getUserInfo(String jwtToken) throws Exception
    {
        Integer userId = jwtService.getUserId(jwtToken);
        User userInfo = userService.getUser(userId);
        return ResponseEntity.ok(userInfo);
    }
}