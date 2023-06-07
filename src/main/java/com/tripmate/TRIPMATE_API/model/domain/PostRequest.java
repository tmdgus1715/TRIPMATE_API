package com.tripmate.TRIPMATE_API.model.domain;

import lombok.Data;

@Data
public class PostRequest {
    Way way;
    Sorting sorting;
    static enum Way {
        DATE, LIKE, HIT,
    }

    static enum Sorting {
        ASC, DESC;
    }
}
