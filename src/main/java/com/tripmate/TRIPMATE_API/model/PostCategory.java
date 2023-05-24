package com.tripmate.TRIPMATE_API.model;

import lombok.*;
import org.w3c.dom.Entity;

@Data
@AllArgsConstructor
@NoArgsConstructor
//public class PostCategory extends Entity{
public class PostCategory {
    private String name;
    private Integer id;

    public PostCategory(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public void checkValidation() {
        if (this == null) throw new NullPointerException("해당 카테고리는 존재하지 않습니다.");
    }
}

