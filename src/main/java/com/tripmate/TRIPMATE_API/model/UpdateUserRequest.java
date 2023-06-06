package com.tripmate.TRIPMATE_API.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UpdateUserRequest {
    private String key;
    private String value;
    private Integer intValue;
    private java.sql.Timestamp timestampValue;
}
