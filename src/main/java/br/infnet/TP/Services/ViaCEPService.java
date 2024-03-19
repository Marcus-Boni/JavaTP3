package br.infnet.TP.Services;

import br.infnet.TP.ViaCEPResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ViaCEPService {

    private final String VIA_CEP_URL = "https://viacep.com.br/ws/29200-260/json";

    private final RestTemplate restTemplate;

    public ViaCEPService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public ViaCEPResponse consultarCEP(String cep) {
        String url = VIA_CEP_URL + cep + "/json";
        return restTemplate.getForObject(url, ViaCEPResponse.class);
    }
}
