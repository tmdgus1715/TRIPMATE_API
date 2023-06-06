package com.tripmate.TRIPMATE_API.model.repository;

import com.tripmate.TRIPMATE_API.model.User;
import com.tripmate.TRIPMATE_API.model.UpdateParameter;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserMapper {
    public User getUser(Integer id);

    public User getUserByLoginId(String loginId);

    public void create(User user);

    public void updatePassword(UpdateParameter updateParameter);

    public void updateName(UpdateParameter updateParameter);

    public void updatePhoneNumber(UpdateParameter updateParameter);

    public void updateNickname(UpdateParameter updateParameter);

    public void updateEmail(UpdateParameter updateParameter);

    public void updateGender(UpdateParameter updateParameter);

    public void updateBirth(UpdateParameter updateParameter);

    public void delete(Integer id);


    User getUserByNickname(String nickname);
}
