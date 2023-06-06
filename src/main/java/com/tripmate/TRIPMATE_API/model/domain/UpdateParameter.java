package com.tripmate.TRIPMATE_API.model.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class UpdateParameter {
    private Integer id;
    private String value;
    private Integer integerValue;
    private java.sql.Timestamp timestampValue;
}
