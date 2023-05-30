package com.tripmate.TRIPMATE_API.service;

public interface ReportService {
    void submitReport(String reason);
    void saveAdditionalReason(String additionalReason);
    void processReport(String reason);
}