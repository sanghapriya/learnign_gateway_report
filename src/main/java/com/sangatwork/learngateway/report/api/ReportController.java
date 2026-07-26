package com.sangatwork.learngateway.report.api;


import com.sangatwork.learngateway.report.domain.Report;
import com.sangatwork.learngateway.report.domain.ReportStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.List;

@RestController
@RequestMapping("/reports")
public class ReportController {



    @GetMapping
    public List<Report> getReports() {


        Report report = new Report(
                java.util.UUID.randomUUID(),
                "Sample Report",
                "This is a sample report description.",
                ReportStatus.PENDING,
                Instant.now()
        );

        return List.of(report);
    }




}
