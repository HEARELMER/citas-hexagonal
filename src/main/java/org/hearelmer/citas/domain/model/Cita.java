package org.hearelmer.citas.domain.model;

import org.hearelmer.citas.domain.valueObject.FechaHoraCita;
import org.hearelmer.citas.domain.valueObject.MedicoId;
import org.hearelmer.citas.domain.valueObject.PacienteId;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 * Entidad de dominio para Cita (sin dependencias de framework).
 */
public class Cita {

    private final Integer idCita;
    private final LocalDateTime fechaRegistro;
    private final LocalDateTime fechaProgramada;
    private final String estado;

    public Cita(Integer idCita, LocalDateTime fechaRegistro, LocalDateTime fechaProgramada, String estado) {
        this.idCita = idCita;
        this.fechaRegistro = Objects.requireNonNull(fechaRegistro, "fechaRegistro es requerida");
        this.fechaProgramada = Objects.requireNonNull(fechaProgramada, "fechaProgramada es requerida");
        this.estado = Objects.requireNonNull(estado, "estado es requerido");
    }

    public Integer getIdCita() {
        return idCita;
    }

    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;
    }

    public LocalDateTime getFechaProgramada() {
        return fechaProgramada;
    }

    public String getEstado() {
        return estado;
    }

    public Ticket generarTicket() {
        int nro = idCita != null ? idCita : (int) (System.currentTimeMillis() % Integer.MAX_VALUE);
        String codigoBarra = "CITA-" + nro + "-" + fechaProgramada.toLocalDate();
        String detalle = "Cita programada el " + fechaProgramada + " (estado=" + estado + ")";
        return new Ticket(nro, codigoBarra, detalle, LocalDateTime.now());
    }
}
