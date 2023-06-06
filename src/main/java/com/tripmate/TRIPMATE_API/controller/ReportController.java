package com.tripmate.TRIPMATE_API.controller;

import com.tripmate.TRIPMATE_API.model.Report;
import com.tripmate.TRIPMATE_API.service.ReportService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/report")
public class ReportController {

    private final ReportService reportService;

    public ReportController(ReportService reportService) {
        this.reportService = reportService;
    }

    @PostMapping("/submit")
    public ResponseEntity<String> submitReport(
            @RequestParam String reason,
            @RequestParam(required = false) String additionalReason
    ) {
        reportService.submitReport(reason);

        if (reason.equals("기타") && additionalReason != null) {
            reportService.submitReport(additionalReason);
        }
        return ResponseEntity.ok("신고 완료");
    }

    @GetMapping("/list")
    public ResponseEntity<String> getReport(@RequestParam Integer id){
        List<Report> reports = reportService.getReport(id);
        return ResponseEntity.ok().build();
    }



}
