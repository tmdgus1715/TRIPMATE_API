package com.tripmate.TRIPMATE_API.model.domain;

public class PostRequest {
    Way way;
    boolean ascending;

    static enum Way {
        DATE, LIKE, HIT,
    }

}
