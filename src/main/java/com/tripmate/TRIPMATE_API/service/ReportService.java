package com.tripmate.TRIPMATE_API.service;

import com.tripmate.TRIPMATE_API.model.domain.Report;

import java.util.List;

public interface ReportService {
    void submitReport(Report report);
    List<Report> getReports();
}