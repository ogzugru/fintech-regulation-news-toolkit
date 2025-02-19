package org.example.adapter;

import org.example.domain.Regulation;
import org.example.domain.service.RegulationAnalysisService;
import org.example.port.RegulationDataProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class RegulationController {

    private final RegulationDataProvider dataProvider;
    private final RegulationAnalysisService analysisService;

    public RegulationController(RegulationDataProvider dataProvider, RegulationAnalysisService analysisService) {
        this.dataProvider = dataProvider;
        this.analysisService = analysisService;
    }

    @GetMapping("/regulations")
    public List<Regulation> getAnalyzedRegulations() {
        // Govinfo API'sinden verileri çek
        List<Regulation> regulations = dataProvider.fetchLatestRegulations();
        // Her bir regülasyonu analiz et
        return regulations.stream()
                .map(analysisService::analyze)
                .collect(Collectors.toList());
    }
}
