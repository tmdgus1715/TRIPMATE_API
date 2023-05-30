package com.tripmate.TRIPMATE_API.model.repository;

import com.tripmate.TRIPMATE_API.model.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface TestMapper {
    List<User> getAllUser();
    User getUser(Integer id);
    void createUser(User user);
}
