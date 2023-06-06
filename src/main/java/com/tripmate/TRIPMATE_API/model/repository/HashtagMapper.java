package com.tripmate.TRIPMATE_API.model.repository;

import com.tripmate.TRIPMATE_API.model.Hashtag;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface HashtagMapper {
    void createHashtag(Hashtag newHashtag);

}
