package com.tripmate.TRIPMATE_API;

import java.util.List;

import com.tripmate.TRIPMATE_API.Mapper.MemberRepository;
import com.tripmate.TRIPMATE_API.VO.MemberVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceimpl implements MemberService{

    @Autowired
    private MemberRepository memberRepository;

    @Override
    public List<MemberVo> getAllMember(){
        return memberRepository.getAllMember();
    }
}
