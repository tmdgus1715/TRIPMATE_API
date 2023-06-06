package com.tripmate.TRIPMATE_API.model.domain;

import lombok.Data;

@Data
public class Report {
    private int id;
    private int user_id;
    private int post_id;
    private String reason;
    private String additionalReason;
}