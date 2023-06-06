package com.tripmate.TRIPMATE_API.model.domain;

import lombok.*;

import java.sql.Timestamp;

@Getter
@ToString
@EqualsAndHashCode
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    Integer id;
    String login_id;
    String password;
    String name;
    String phone_number;
    String nickname;
    String email;
    Integer authority;
    java.sql.Timestamp updated_at;
    Boolean is_valid;
    Integer reports_count;
    java.sql.Timestamp withdrawn_at;
    Boolean grant_post;
    Integer gender;
    java.sql.Date birth;


    public void setUserInit() {
        this.authority = 0; // 0: 일반 유저, 1: 관리자
        this.is_valid = true;
        this.reports_count = 0;
        this.grant_post = true;
        java.sql.Timestamp update_time = new java.sql.Timestamp(System.currentTimeMillis());
        this.updated_at = update_time;
    }

    public void checkValidation() {
        if (this == null || this.is_valid == false) throw new NullPointerException("해당 유저는 존재하지 않습니다.");
    }
}
