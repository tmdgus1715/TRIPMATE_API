package com.tripmate.TRIPMATE_API.repository;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CheckValidationMapper {

    boolean isExistingUser(Integer id);

    boolean isExistingPassword(String password);

    boolean isExistingEmail(String email);

}
