package com.tripmate.TRIPMATE_API.service;

import com.tripmate.TRIPMATE_API.model.Report;
import com.tripmate.TRIPMATE_API.model.TouristAttractionCategory;

import java.util.List;

public interface ReportService {
    void submitReport(String reason);
    List<Report> getReport(Integer id);
}