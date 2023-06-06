package com.tripmate.TRIPMATE_API.service;

import com.tripmate.TRIPMATE_API.repository.CheckValidationMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class CheckValidationServiceImpl implements CheckValidationService {

    private final CheckValidationMapper checkValidationMapper;
    @Override
    public boolean isContentLengthValid(String content) {
        int contentLength = content.length();
        return contentLength >= 1 && contentLength <= 1000;
    }

    @Override
    public boolean isTitleLengthValid(String title) {
        int titleLength = title.length();
        return titleLength >= 1 && titleLength <= 20;
    }

    @Override
    public boolean isExistingUser(Integer id) {
        // 이미 존재하는 아이디인지 검사
        checkValidationMapper.isExistingUser(id);
        return true; // 존재한다면 true 반환, 아니라면 false 반환
    }

    @Override
    public boolean isExistingPassword(String password) {
        // 이미 존재하는 비밀번호인지 검사
        checkValidationMapper.isExistingPassword(password);
        return true; // 존재한다면 true 반환, 아니라면 false 반환
    }

    @Override
    public boolean isExistingEmail(String email) {
        // 이미 존재하는 이메일인지 검사하는 로직 구현
        checkValidationMapper.isExistingEmail(email);
        return true; // 존재한다면 true 반환, 아니라면 false 반환
    }

//    @Override
//    public boolean isTotalMediaSizeValid(List<MediaFile> mediaFiles) {
//        long totalSize = calculateTotalSize(mediaFiles);
//        long maxSize = 500 * 1024 * 1024; // 500MB를 byte로 변환
//        return totalSize <= maxSize;
//    }
//
//    private long calculateTotalSize(List<MediaFile> mediaFiles) {
//        long totalSize = 0;
//        for (MediaFile mediaFile : mediaFiles) {
//            totalSize += mediaFile.getSize();
//        }
//        return totalSize;
//    }
}
