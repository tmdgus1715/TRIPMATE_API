package com.tripmate.TRIPMATE_API.repository;

import org.apache.ibatis.annotations.Mapper;
import com.tripmate.TRIPMATE_API.model.Report;

@Mapper
public interface ReportMapper {
    void insertReport(Report report);
}
