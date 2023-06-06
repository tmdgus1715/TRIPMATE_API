package com.tripmate.TRIPMATE_API.controller;

import com.tripmate.TRIPMATE_API.model.Report;
import com.tripmate.TRIPMATE_API.service.ReportService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor // 생성자 역할
@RequestMapping("/report")
public class ReportController {

    private final ReportService reportService;

    @PostMapping("/submit")
    public ResponseEntity<String> submitReport(
            @RequestBody Report report
    ) {
        reportService.submitReport(report);
        return ResponseEntity.ok("신고 완료");
    }

    @GetMapping("/list")
    public ResponseEntity<List<Report>> getReports(){
        List<Report> reports = reportService.getReports();
        return ResponseEntity.ok(reports);
    }
}
