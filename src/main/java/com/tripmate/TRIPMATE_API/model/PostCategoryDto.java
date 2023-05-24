package com.tripmate.TRIPMATE_API.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PostCategoryDto {
    private Integer id;
    private String name;

    public PostCategoryDto(PostCategory category) {
        this.id = category.getId();
        this.name = category.getName();
    }

    public PostCategory toEntity() {
        return new PostCategory(this.id, this.name);
    }
}