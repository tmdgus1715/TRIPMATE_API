package com.tripmate.TRIPMATE_API.repository;

import com.tripmate.TRIPMATE_API.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface TestMapper {
    List<User> getAllUser();
}
