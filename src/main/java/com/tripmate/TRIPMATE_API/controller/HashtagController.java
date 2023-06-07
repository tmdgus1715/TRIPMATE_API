package com.tripmate.TRIPMATE_API.controller;

import com.tripmate.TRIPMATE_API.model.domain.Hashtag;
import com.tripmate.TRIPMATE_API.service.HashtagService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

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