package com.tripmate.TRIPMATE_API.model.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Post {
    private Integer id;
    private Integer type;
    private Integer like_count;
    private String posted_at;
    private String updated_at;
    private String deleted_at;
    private Integer is_valid;
    private String content;
    private String title;
    private Integer hit;
    private Integer user_id;
    private Integer category_id;
    private Integer tourist_attraction_id;

    public void setForDB(Post existed) {
        this.id = (this.id != null) ? this.id : existed.getId();
        this.type = (this.type != null) ? this.type : existed.getType();
        this.like_count = (this.like_count != null) ? this.like_count : existed.getLike_count();
        this.posted_at = (this.posted_at != null) ? this.posted_at : existed.getPosted_at();
        this.updated_at = (this.updated_at != null) ? this.updated_at : existed.getUpdated_at();
        this.deleted_at = (this.deleted_at != null) ? this.deleted_at : existed.getDeleted_at();
        this.is_valid = (this.is_valid != null) ? this.is_valid : existed.getIs_valid();
        this.content = (this.content != null) ? this.content : existed.getContent();
        this.title = (this.title != null) ? this.title : existed.getTitle();
        this.hit = (this.hit != null) ? this.hit : existed.getHit();
        this.user_id = (this.user_id != null) ? this.user_id : existed.getUser_id();
        this.category_id = (this.category_id != null) ? this.category_id : existed.getCategory_id();
        this.tourist_attraction_id = (this.tourist_attraction_id != null) ? this.tourist_attraction_id : existed.getTourist_attraction_id();
    }
}
