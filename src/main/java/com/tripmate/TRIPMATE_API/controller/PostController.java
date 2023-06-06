package com.tripmate.TRIPMATE_API.controller;

import com.tripmate.TRIPMATE_API.model.domain.Post;
import com.tripmate.TRIPMATE_API.model.dto.PostRequest;
import com.tripmate.TRIPMATE_API.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(produces = "application/json; charset=utf8")
public class PostController {
    private final PostService postService;

    @PostMapping("/posts")
    public ResponseEntity<Object> writePost(@RequestBody Post newPost) {
        postService.writePost(newPost);
        return ResponseEntity.ok().build();
    }

    @PatchMapping("/post/{postId}")
    public ResponseEntity<Object> updatePost(@PathVariable Integer postId, @RequestBody Post post) {
      //  postService.updatePost(post);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/post/{postId}")
    public ResponseEntity<Object> deletePost(@PathVariable Integer postId) throws Exception {
        postService.deletePost(postId);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/post/{postId}/like")
    public ResponseEntity<Object> likePost(@PathVariable Integer postId) {
        postService.like(postId);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/post/{postId}")//게시물 내용 조회
    public ResponseEntity<Post> getPost(@PathVariable Integer postId) {
        Post post = postService.getPost(postId);
        return ResponseEntity.ok(post);
    }

    @GetMapping("/post/user/{userId}")//유저의 게시물 목록 조회
    public ResponseEntity<List<Post>> getUserPosts(@PathVariable Integer userId) {
        List<Post> posts = postService.getPostsByUserId(userId);
        return ResponseEntity.ok(posts);
    }

    @GetMapping("/post/category/{categoryId}")//카테고리별 게시물 목록 조회
    public ResponseEntity<List<Post>> getPosts(@PathVariable Integer categoryId) {
        List<Post> posts = postService.getPostsByCategory(categoryId);
        return ResponseEntity.ok(posts);
    }

    @GetMapping("/post")//전체 게시글 목록 조회
    public ResponseEntity<List<Post>> getPosts(@RequestBody PostRequest postRequest) {
        List<Post> posts = postService.getPosts(postRequest);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/post/hashtag")//해시 태그별로 목록 조회
    public ResponseEntity<List<Post>> getPosts(@RequestBody List<Integer> postHashTagRequest) {
        List<Post> posts = postService.getPostsByHashtag(postHashTagRequest);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/post/tavel-attraction/{tavelAttractionId}")//여행지별로 조회
    public ResponseEntity<List<Post>> getTravelAttractionPosts(@PathVariable Integer travelAttractionId) {
        List<Post> posts = postService.getPostsByTravelAttractionPosts(travelAttractionId);
        return ResponseEntity.ok().build();
    }
}
