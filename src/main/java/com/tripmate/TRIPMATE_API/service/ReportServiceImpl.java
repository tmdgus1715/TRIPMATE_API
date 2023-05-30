package com.tripmate.TRIPMATE_API.service;

import com.tripmate.TRIPMATE_API.model.Report;
import com.tripmate.TRIPMATE_API.repository.ReportMapper;
import org.springframework.stereotype.Service;

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
        // 데이터베이스에 저장
        reportMapper.insertReport(report);
    }

    @Override
    public void saveAdditionalReason(String additionalReason) {
        Report report = new Report();
        report.setReason("기타");
        report.setAdditionalReason(additionalReason);
        // 데이터베이스에 저장
        reportMapper.insertReport(report);
    }

    @Override
    public void processReport(String reason) {
        // 운영자에게 신고사유를 확인하여 경고 횟수를 추가하는 로직 구현
    }
}
