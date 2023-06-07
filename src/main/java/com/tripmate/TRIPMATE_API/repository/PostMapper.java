package com.tripmate.TRIPMATE_API.repository;

import com.tripmate.TRIPMATE_API.model.domain.Post;
import com.tripmate.TRIPMATE_API.model.domain.PostRequest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface PostMapper {

    void writePost(Post newPost, @Param("user") Integer id);

    void updatePost(Integer postId, @Param("post") Post post);

    void deletePost(Integer postId);

    void likePost(Integer postId);

    Post getPost(Integer postId);

    List<Post> getPostsByUserId(Integer userId);

    List<Post> getPostsByCategory(Integer categoryId);

    List<Post> getPosts(PostRequest postRequest);

    List<Post> getPostByHashtag(@Param("hashtags")List<Integer> postHashTagRequest);

    List<Post> getPostsByTravelAttractionPosts(Integer travelAttractionId);
}
