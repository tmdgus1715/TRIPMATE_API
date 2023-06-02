package com.tripmate.TRIPMATE_API.controller;

import com.tripmate.TRIPMATE_API.service.ReportService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
        // 사용자가 신고한 내용을 데이터베이스에 저장하는 로직 구현
        reportService.submitReport(reason);

        if (reason.equals("기타") && additionalReason != null) {
            // 기타 사유에 대한 추가 입력이 필요한 경우
            // 사용자가 입력한 기타 신고사유를 데이터베이스에 저장하는 로직 구현
            reportService.saveAdditionalReason(additionalReason);
        }

        // 운영자에게 신고사유를 확인하여 경고 횟수를 추가하는 로직 구현
        reportService.processReport(reason);

        return ResponseEntity.ok("신고 처리 완료");
    }
}
