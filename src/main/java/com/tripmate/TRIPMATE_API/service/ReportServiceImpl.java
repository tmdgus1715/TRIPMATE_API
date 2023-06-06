package com.tripmate.TRIPMATE_API.service;

import com.tripmate.TRIPMATE_API.model.Report;
import com.tripmate.TRIPMATE_API.repository.ReportMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportServiceImpl implements ReportService {

    private final ReportMapper reportMapper;

    public ReportServiceImpl(ReportMapper reportMapper) {
        this.reportMapper = reportMapper;
    }

    @Override
    public void submitReport(String reason) {
        Report report = new Report();
        report.setReason(reason);
        reportMapper.insertReport(report);
    }

    @Override
    public List<Report> getReport(Integer id) {
        List<Report> list = reportMapper.getReport(id);
        return list;
    }

//    @Override
//    public void saveAdditionalReason(String additionalReason) {
//        Report report = new Report();
//        report.setReason("기타");
//        report.setAdditionalReason(additionalReason);
//        reportMapper.insertReport(report);
//    }


}
