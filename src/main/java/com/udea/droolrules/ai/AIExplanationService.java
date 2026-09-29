package com.udea.droolrules.ai;

import org.springframework.stereotype.Service;

@Service
public class AIExplanationService {

    public String explain(String decision) {
        if (decision == null || decision.isBlank() || decision.equals("[]")) {
            return """
                ✈️ Aerolínea UdeA - Resumen de Reserva
                ----------------------------------------
                Estimado pasajero, hemos evaluado los datos de su vuelo.
                Actualmente no aplican beneficios ni promociones especiales según las políticas vigentes.
                
                ¡Le deseamos un excelente viaje!
                """;
        }

        // Limpieza básica del string que entrega Drools para listar las reglas ordenadas
        String reglasFormateadas = decision
                .replace("[", "")
                .replace("]", "")
                .replace(", ", "\n  • ");

        return """
            ✈️ Aerolínea UdeA - Notificación de Beneficios
            ------------------------------------------------
            ¡Buenas noticias! Tras evaluar las condiciones de su vuelo, se han aplicado los siguientes beneficios a su reserva:

              • %s

            Motivo de aplicación:
            1. Ascenso de Categoría: Aplicado automáticamente por superar los 60 minutos de retraso en su itinerario.
            2. Descuento Especial: Concedido por viajar con equipaje ligero (<10 kg).

            Agradecemos su preferencia y paciencia con Aerolíneas UdeA.
            """.formatted(reglasFormateadas);
    }
}