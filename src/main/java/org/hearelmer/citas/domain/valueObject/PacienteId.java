package org.hearelmer.citas.domain.valueObject;

import java.util.Objects;

/**
 * Value Object que asegura identidad de paciente válida.
 */
public record PacienteId(Long value) {
    public PacienteId {
        Objects.requireNonNull(value, "PacienteId no puede ser nulo");
        if (value <= 0) {
            throw new IllegalArgumentException("PacienteId debe ser mayor a cero");
        }
    }
}
