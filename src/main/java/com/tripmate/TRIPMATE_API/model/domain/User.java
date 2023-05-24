package com.tripmate.TRIPMATE_API.model.domain;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    int id;
    String name;
}
