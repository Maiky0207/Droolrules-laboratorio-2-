package com.udea.droolrules.controller;

import com.udea.droolrules.ai.AIExplanationService;
import com.udea.droolrules.model.FlightRequest;
import com.udea.droolrules.model.FlightResponse;
import com.udea.droolrules.model.Passenger;
import com.udea.droolrules.model.Flight;
import com.udea.droolrules.service.AirlineEvaluationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/airline")
public class AirlineController {

    @Autowired
    private AirlineEvaluationService evaluationService;

    @Autowired
    private AIExplanationService aiService;

    // --- ENDPOINTS REST (Usan @ResponseBody para responder JSON) ---

    @PostMapping("/api/evaluate")
    @ResponseBody
    public Map<String, Object> evaluateFlight(@RequestBody FlightRequest request) {
        FlightResponse response = evaluationService.evaluateFlight(request);

        Map<String, Object> result = new HashMap<>();
        result.put("rulesOutput", response);
        result.put("passengerDetails", request.getPassenger());
        result.put("flightDetails", request.getFlight());

        return result;
    }

    @PostMapping("/api/evaluate-ai")
    @ResponseBody
    public Map<String, Object> evaluateFlightWithAI(@RequestBody FlightRequest request) {
        FlightResponse response = evaluationService.evaluateFlight(request);
        String aiExplanation = aiService.explain(response.getAppliedRules().toString());

        Map<String, Object> result = new HashMap<>();
        result.put("rulesOutput", response);
        result.put("aiExplanation", aiExplanation);

        return result;
    }

    // --- ENDPOINTS WEB PARA VISTAS THYMELEAF ---

    // 1. Cargar el formulario HTML en el navegador
    @GetMapping("/form")
    public String showFlightForm(Model model) {
        FlightRequest request = new FlightRequest();
        request.setPassenger(new Passenger());
        request.setFlight(new Flight());
        model.addAttribute("flightRequest", request);
        return "flight_form";
    }

    // 2. Procesar el formulario HTML y mostrar la vista de resultados
    @PostMapping("/evaluate")
    public String evaluateFlightWeb(@ModelAttribute FlightRequest request, Model model) {
        FlightResponse response = evaluationService.evaluateFlight(request);
        String explanation = aiService.explain(response.getAppliedRules().toString());

        model.addAttribute("rulesOutput", response);
        model.addAttribute("aiExplanation", explanation);
        return "flight_result";
    }
}