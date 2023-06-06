package com.tripmate.TRIPMATE_API.service;

import com.tripmate.TRIPMATE_API.model.domain.User;
import com.tripmate.TRIPMATE_API.model.domain.LoginUserRequest;

public interface UserService {
    void create(User user);

    User getUser(Integer id);

    User getUserByLoginId(String loginId);

    void updatePassword(Integer userId, String newPassword);
    void updateName(Integer userId, String newName);
    void updatePhoneNumber(Integer userId, String newPhoneNumber);

    void updateNickname(Integer userId, String newNickname);
    void updateEmail(Integer userId, String newEmail);
    void updateGender(Integer userId, Integer Gender);
    void updateBirth(Integer userId, java.sql.Timestamp newBirth);

    void delete(Integer userId, String password);

    String login(LoginUserRequest loginUserRequest);
}
