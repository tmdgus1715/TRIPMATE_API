package com.tripmate.TRIPMATE_API.controller;

import com.tripmate.TRIPMATE_API.model.Hashtag;
import com.tripmate.TRIPMATE_API.service.HashtagService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class HashtagController {
    private final HashtagService hashtagService;

    @PostMapping("/hashtags")
    ResponseEntity<Object> createHashtag(Hashtag newHashtag)
    {
        hashtagService.createHashtag(newHashtag);
        return ResponseEntity.ok().build();
    }
}
