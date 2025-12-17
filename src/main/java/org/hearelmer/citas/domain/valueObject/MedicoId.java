package org.hearelmer.citas.domain.valueObject;

import java.util.Objects;

/**
 * Value Object que asegura identidad de médico válida.
 */
public record MedicoId(Long value) {
    public MedicoId {
        Objects.requireNonNull(value, "MedicoId no puede ser nulo");
        if (value <= 0) {
            throw new IllegalArgumentException("MedicoId debe ser mayor a cero");
        }
    }
}
