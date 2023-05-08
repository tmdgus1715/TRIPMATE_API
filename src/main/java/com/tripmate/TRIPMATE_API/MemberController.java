package com.tripmate.TRIPMATE_API;

import java.util.List;

import com.tripmate.TRIPMATE_API.VO.MemberVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
@RequiredArgsConstructor
public class MemberController {


    private final MemberService memberService;

    @RequestMapping(value="/index")
    public String index(Model model) {

        List<MemberVo> memberList = memberService.getAllMember();
        System.out.println("size: " + memberList.size());

        memberList.forEach(a -> System.out.println(a.toString()));

        return "success";
    }
}