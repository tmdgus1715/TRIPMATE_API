package com.tripmate.TRIPMATE_API.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class LoginUserRequest {
    private String login_id;
    private String password;
}
