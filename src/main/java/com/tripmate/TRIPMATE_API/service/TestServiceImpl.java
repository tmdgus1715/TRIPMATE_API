package com.tripmate.TRIPMATE_API.service;

import com.tripmate.TRIPMATE_API.model.User;
import com.tripmate.TRIPMATE_API.repository.TestMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TestServiceImpl implements TestService{

    private final TestMapper testMapper;
    @Override
    public List<User> getAllUser() {
        List<User> allUser = testMapper.getAllUser();
        return allUser;
    }

    @Override
    public User getUser(int id) {
        User user = testMapper.getUser(id);
        return user;
    }

    @Override
    public void createUser(User user) {
        testMapper.createUser(user);
    }
}
