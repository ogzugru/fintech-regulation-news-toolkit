package org.example.port;

import org.example.domain.Regulation;

import java.util.List;

public interface RegulationDataProvider {
    /**
     * Govinfo API ya da benzeri kaynaklardan güncel regülasyon verilerini çeker.
     * @return Regülasyon listesi
     */
    List<Regulation> fetchLatestRegulations();
}