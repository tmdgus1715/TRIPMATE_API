package com.tripmate.TRIPMATE_API.service;

public interface JwtService {
    public String createToken(Integer id);

    public Integer getUserId(String jwtToken) throws Exception;

    public void checkValid(String token);
}
