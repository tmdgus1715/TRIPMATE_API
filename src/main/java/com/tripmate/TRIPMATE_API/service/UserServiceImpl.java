package com.tripmate.TRIPMATE_API.service;

import com.tripmate.TRIPMATE_API.model.User;
import com.tripmate.TRIPMATE_API.model.LoginUserRequest;
import com.tripmate.TRIPMATE_API.model.UpdateParameter;
import com.tripmate.TRIPMATE_API.model.repository.UserMapper;
import com.tripmate.TRIPMATE_API.util.Encryption;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{
    private final UserMapper userMapper;

    //private final PostMapper postMapper;
    private final JwtService jwtService;
    private final Encryption encryption;
    //private final CheckValidationService check;

    @Override
    public void create(User newUser)
    {
        //check.checkValidationUser(newUser);

        String hashedPassword = encryption.encrypt(newUser.getPassword());
        newUser.setPassword(hashedPassword);

        newUser.setUserInit();
        userMapper.create(newUser);
    }

    @Override
    public  String login(LoginUserRequest loginUserRequest)
    {
        User user = userMapper.getUserByLoginId(loginUserRequest.getLogin_id());
        user.checkValidation();

        encryption.checkPassword(loginUserRequest.getPassword(), user.getPassword());

        String token = jwtService.createToken(user.getId());

        return token;
    }

    @Override
    public User getUser(Integer userId) {
        User user = userMapper.getUser(userId);
        user.checkValidation();

        return user;
    }

    @Override
    public User getUserByLoginId(String loginId) {
        User user = userMapper.getUserByLoginId(loginId);

        return user;
    }

    @Override
    public void updatePassword(Integer userId, String newPassword) {
        //check.checkValidationUserPassword(newPassword);

        User user = userMapper.getUser(userId);
        user.checkValidation();

        String hashedPassword = encryption.encrypt(newPassword);

        UpdateParameter updateParameter = UpdateParameter.builder().id(user.getId()).value(hashedPassword).build();

        userMapper.updatePassword(updateParameter);
    }

    public void updateName(Integer userId, String newName) {
        //check.checkValidationUserName(newName);

        User user = userMapper.getUser(userId);
        user.checkValidation();

        UpdateParameter updateParameter = UpdateParameter.builder().id(user.getId()).value(newName).build();

        userMapper.updateName(updateParameter);
    }

    public void updatePhoneNumber(Integer userId, String newPhoneNumber) {
        //check.checkValidationUserPhoneNumber(newPhoneNumber);

        User user = userMapper.getUser(userId);
        user.checkValidation();

        UpdateParameter updateParameter = UpdateParameter.builder().id(user.getId()).value(newPhoneNumber).build();

        userMapper.updatePhoneNumber(updateParameter);
    }

    @Override
    public void updateNickname(Integer userId, String newNickname) {
        //check.checkValidationUserNickname(newNickname);

        User user = userMapper.getUser(userId);
        user.checkValidation();

        UpdateParameter updateParameter = UpdateParameter.builder().id(user.getId()).value(newNickname).build();

        userMapper.updateNickname(updateParameter);
    }

    public void updateEmail(Integer userId, String newEmail) {
        //check.checkValidationUserEmail(newEmail);

        User user = userMapper.getUser(userId);
        user.checkValidation();

        UpdateParameter updateParameter = UpdateParameter.builder().id(user.getId()).value(newEmail).build();

        userMapper.updateEmail(updateParameter);
    }

    public void updateGender(Integer userId, Integer newGender) {
        //check.checkValidationUserGender(newGender);

        User user = userMapper.getUser(userId);
        user.checkValidation();

        UpdateParameter updateParameter = UpdateParameter.builder().id(user.getId()).integerValue(newGender).build();

        userMapper.updateGender(updateParameter);
    }

    public void updateBirth(Integer userId, java.sql.Timestamp newBirth) {
        //check.checkValidationUserBirth(newBirth);

        User user = userMapper.getUser(userId);
        user.checkValidation();

        UpdateParameter updateParameter = UpdateParameter.builder().id(user.getId()).timestampValue(newBirth).build();

        userMapper.updateBirth(updateParameter);
    }

    @Override
    public void delete(Integer userId, String password) {
        User user = userMapper.getUser(userId);
        user.checkValidation();

        encryption.checkPassword(password, user.getPassword());

        userMapper.delete(user.getId());

        //postMapper.withdrawAllPost(user.getId());
    }
}
