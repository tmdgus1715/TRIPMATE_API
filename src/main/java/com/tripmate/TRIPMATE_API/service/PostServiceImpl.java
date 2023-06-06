package com.tripmate.TRIPMATE_API.service;

import com.tripmate.TRIPMATE_API.model.domain.Post;
import com.tripmate.TRIPMATE_API.model.domain.PostRequest;
import com.tripmate.TRIPMATE_API.repository.PostMapper;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {
    private final PostMapper postMapper;

    @Override
    public void writePost(Post newPost) {
        Integer id = getUserId();
        postMapper.writePost(newPost, id);
    }

    @Override
    public void updatePost(Integer id, Post post) {
        postMapper.updatePost(post);
    }

    @Override
    public void deletePost(Integer postId) {
        postMapper.deletePost(postId);
    }

    @Override
    public void like(Integer postId) {
        postMapper.likePost(postId);
    }

    @Override
    public Post getPost(Integer postId) {
        return postMapper.getPost(postId);
    }

    @Override
    public List<Post> getPostsByUserId(Integer userId) {
        return postMapper.getPostsByUserId(userId);
    }

    @Override
    public List<Post> getPostsByCategory(Integer categoryId) {
        return postMapper.getPostsByCategory(categoryId);
    }

    @Override
    public List<Post> getPosts(PostRequest postRequest) {
        return postMapper.getPosts(postRequest);
    }

    @Override
    public List<Post> getPostsByHashtag(List<Integer> postHashTagRequest) {
        return postMapper.getPostByHashtag(postHashTagRequest);
      /*  <select id="getUsersByIds" parameterType="java.util.List" resultType="User">
                SELECT * FROM users
        WHERE id IN
                <foreach collection="ids" item="id" open="(" close=")" separator=",">
        #{id}
    </foreach>
</select>*/
    }

    @Override
    public List<Post> getPostsByTravelAttractionPosts(Integer travelAttractionId) {
        return postMapper.getPostsByTravelAttractionPosts(travelAttractionId);
    }

    private Integer getUserId() {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();
        String token = request.getHeader("token");
        return 0;
    }
}
