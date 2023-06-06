package com.tripmate.TRIPMATE_API.util;

public interface Encryption {
    public String encrypt(String password);

    public void checkPassword(String plainPassword, String hashedPassword);
}
