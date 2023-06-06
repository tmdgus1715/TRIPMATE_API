package com.tripmate.TRIPMATE_API.service;

import com.tripmate.TRIPMATE_API.model.Hashtag;
import com.tripmate.TRIPMATE_API.model.repository.HashtagMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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
