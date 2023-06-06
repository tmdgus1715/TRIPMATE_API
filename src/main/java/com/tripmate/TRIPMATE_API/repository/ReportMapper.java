package com.tripmate.TRIPMATE_API.repository;

import org.apache.ibatis.annotations.Mapper;
import com.tripmate.TRIPMATE_API.model.Report;

import java.util.List;

@Mapper
public interface ReportMapper {
    void insertReport(Report report);

    public List<Report> getReports();
}
