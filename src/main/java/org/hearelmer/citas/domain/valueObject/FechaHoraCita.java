package org.hearelmer.citas.domain.valueObject;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 * Value Object para la fecha y hora de la cita.
 */
public record FechaHoraCita(LocalDateTime value) {
    public FechaHoraCita {
        Objects.requireNonNull(value, "fechaHora no puede ser nula");
    }
}
