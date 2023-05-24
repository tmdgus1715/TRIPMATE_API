package com.tripmate.TRIPMATE_API.service;

import com.tripmate.TRIPMATE_API.model.domain.User;

import java.util.List;

public interface TestService {
    public List<User> getAllUser();

    public User getUser(int id);

    public void createUser(User user);
}
