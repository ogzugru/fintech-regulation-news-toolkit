package org.example.adapter.springai;

import org.example.domain.Regulation;
import org.example.domain.service.RegulationAnalysisService;
import org.springframework.stereotype.Service;

@Service
public class SpringAIAnalysisAdapter implements RegulationAnalysisService {

    @Override
    public Regulation analyze(Regulation regulation) {
        // Spring AI entegrasyonu burada yapılacak.
        // Örneğin, metin analizi (NLP), duygu analizi veya özet çıkarımı yapılabilir.
        // Demo amaçlı olarak, analiz sonucunu basitçe metnin sonuna ekliyoruz.
        String content = regulation.getContent();
        String simulatedAnalysis = "[Spring AI Analizi: İçerikte olumlu eğilim tespit edildi]";
        regulation.setAnalysisResult(simulatedAnalysis);
        return regulation;
    }
}