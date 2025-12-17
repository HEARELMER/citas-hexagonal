package org.hearelmer.citas.domain.model;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 * Ticket generado al reservar una cita.
 */
public class Ticket {

    private final Integer nroTicket;
    private final String codigoBarra;
    private final String detalleCita;
    private final LocalDateTime fechaImpresion;

    public Ticket(Integer nroTicket, String codigoBarra, String detalleCita, LocalDateTime fechaImpresion) {
        this.nroTicket = Objects.requireNonNull(nroTicket, "nroTicket es requerido");
        this.codigoBarra = Objects.requireNonNull(codigoBarra, "codigoBarra es requerido");
        this.detalleCita = Objects.requireNonNull(detalleCita, "detalleCita es requerido");
        this.fechaImpresion = Objects.requireNonNull(fechaImpresion, "fechaImpresion es requerida");
    }

    public Integer getNroTicket() {
        return nroTicket;
    }

    public String getCodigoBarra() {
        return codigoBarra;
    }

    public String getDetalleCita() {
        return detalleCita;
    }

    public LocalDateTime getFechaImpresion() {
        return fechaImpresion;
    }
}
