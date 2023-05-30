package com.tripmate.TRIPMATE_API.model;

public class Report {
    private String reason;
    private String additionalReason;

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getReason() {
        return reason;
    }

    public void setAdditionalReason(String additionalReason) {
        this.additionalReason = additionalReason;
    }

    public String getAdditionalReason() {
        return additionalReason;
    }
}