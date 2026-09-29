package com.udea.droolrules.service;

import com.udea.droolrules.model.FlightRequest;
import com.udea.droolrules.model.FlightResponse;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service; // <-- Asegúrate de importar esto

@Service // <-- ESTA ANOTACIÓN ES OBLIGATORIA
public class AirlineEvaluationService {

    @Autowired
    private KieContainer kieContainer;

    public FlightResponse evaluateFlight(FlightRequest request) {
        FlightResponse response = new FlightResponse();
        KieSession kieSession = kieContainer.newKieSession();

        try {
            kieSession.insert(request);
            kieSession.insert(response);
            kieSession.fireAllRules();
        } finally {
            kieSession.dispose();
        }

        return response;
    }
}