package org.example.domain.service;

import org.example.domain.Regulation;

public interface RegulationAnalysisService {
    /**
     * Verilen regülasyonun içeriğini analiz eder (örn. duygu analizi, özet çıkarımı).
     * @param regulation Analiz edilecek regülasyon
     * @return Analiz sonuçları içeren güncellenmiş regülasyon
     */
    Regulation analyze(Regulation regulation);
}