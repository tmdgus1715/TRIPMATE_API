package com.tripmate.TRIPMATE_API.service;

public interface CheckValidationService {
    boolean isContentLengthValid(String content);

    boolean isTitleLengthValid(String title);

    boolean isExistingUser(Integer id);

    boolean isExistingPassword(String password);

    boolean isExistingEmail(String email);

//    boolean isTotalMediaSizeValid(List<MediaFile> mediaFiles);
}