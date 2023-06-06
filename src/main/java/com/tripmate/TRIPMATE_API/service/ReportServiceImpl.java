package com.tripmate.TRIPMATE_API.service;

import com.tripmate.TRIPMATE_API.model.domain.Report;
import com.tripmate.TRIPMATE_API.repository.ReportMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class ReportServiceImpl implements ReportService {

    private final ReportMapper reportMapper;

    @Override
    public void submitReport(Report report) {
        reportMapper.insertReport(report);
    }

    @Override
    public List<Report> getReports() {
        List<Report> list = reportMapper.getReports();
        return list;
    }
}
