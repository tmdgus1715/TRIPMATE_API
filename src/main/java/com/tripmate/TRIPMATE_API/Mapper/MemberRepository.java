package com.tripmate.TRIPMATE_API.Mapper;


import java.util.List;

import com.tripmate.TRIPMATE_API.VO.MemberVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface MemberRepository {
    List<MemberVo> getAllMember();
}