package com.tripmate.TRIPMATE_API.service;

import com.tripmate.TRIPMATE_API.model.domain.Hashtag;
import com.tripmate.TRIPMATE_API.repository.HashtagMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class HashtagServiceImpl implements HashtagService{
    private final HashtagMapper hashtagMapper;

    @Override
    public void createHashtag(Hashtag newHashtag)
    {
        hashtagMapper.createHashtag(newHashtag);
    }
}