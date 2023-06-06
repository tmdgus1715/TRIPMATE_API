package com.tripmate.TRIPMATE_API.service;

import com.tripmate.TRIPMATE_API.model.domain.Post;
import com.tripmate.TRIPMATE_API.model.dto.PostRequest;

import java.util.List;

public interface PostService {
    void writePost(Post newPost);

    void updatePost(Integer id, Post post);

    void deletePost(Integer postId);

    void like(Integer postId);

    Post getPost(Integer postId);

    List<Post> getPostsByUserId(Integer userId);

    List<Post> getPostsByCategory(Integer categoryId);

    List<Post> getPosts(PostRequest postRequest);

    List<Post> getPostsByHashtag(List<Integer> postHashTagRequest);

    List<Post> getPostsByTravelAttractionPosts(Integer travelAttractionId);

}
