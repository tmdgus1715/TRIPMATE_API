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
//이미지 media에 넣는 것, post_hashtag에 삽입.
    @Override
    public void writePost(Post newPost) {
        Integer id = getUserId();
        postMapper.writePost(newPost, id);
    }

    @Override
    public void updatePost(Integer id, Post post) {
        Post exist = postMapper.getPost(id);
        post.setForDB(exist);
        postMapper.updatePost(id, post);
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
    public List<Post> getPostsByUserId(Integer userId, PostRequest postRequest) {
        return postMapper.getPostsByUserId(userId);
    }

    @Override
    public List<Post> getPostsByCategory(Integer categoryId, PostRequest postRequest) {
        return postMapper.getPostsByCategory(categoryId);
    }

    @Override
    public List<Post> getPosts(PostRequest postRequest) {
        return postMapper.getPosts(postRequest);
    }

    @Override
    public List<Post> getPostsByHashtag(List<Integer> postHashTagRequest, PostRequest postRequest) {
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
    public List<Post> getPostsByTravelAttractionPosts(Integer travelAttractionId, PostRequest postRequest) {
        return postMapper.getPostsByTravelAttractionPosts(travelAttractionId);
    }

    private Integer getUserId() {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();
        String token = request.getHeader("token");
        return 0;
    }
}
