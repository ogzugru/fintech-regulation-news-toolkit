package org.example.adapter.govinfo;


import org.example.domain.Regulation;
import org.example.port.RegulationDataProvider;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class GovInfoApiAdapter implements RegulationDataProvider {

    private final RestTemplate restTemplate = new RestTemplate();
    // Örnek: Gerçek API URL'nizi ve parametrelerinizi buraya ekleyin.
    private final String apiUrl = "https://api.govinfo.gov/your-endpoint";

    @Override
    public List<Regulation> fetchLatestRegulations() {
        // Örnek: API çağrısı yapılacak, alınan JSON verisi parse edilecek
        // Burada demo amaçlı sabit veri döndürüyoruz.
        List<Regulation> regulations = new ArrayList<>();
        regulations.add(new Regulation("1", "Finansal Regülasyon A", "Bu regülasyon, piyasa denetimini düzenler.", LocalDate.now()));
        regulations.add(new Regulation("2", "Finansal Regülasyon B", "Bu regülasyon, yatırımcı korumasını sağlar.", LocalDate.now()));
        return regulations;
    }
}