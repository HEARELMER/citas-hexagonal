package org.hearelmer.citas.domain.model;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 * Entidad de dominio pura para la gestión de citas.
 */
public class Cita {

    private final Long id;
    private final LocalDateTime fechaHora;
    private final Long pacienteId;
    private final Long medicoId;
    private final CitaEstado estado;

    public Cita(Long id, LocalDateTime fechaHora, Long pacienteId, Long medicoId, CitaEstado estado) {
        this.id = id;
        this.fechaHora = Objects.requireNonNull(fechaHora, "fechaHora es requerida");
        this.pacienteId = Objects.requireNonNull(pacienteId, "pacienteId es requerido");
        this.medicoId = Objects.requireNonNull(medicoId, "medicoId es requerido");
        this.estado = Objects.requireNonNull(estado, "estado es requerido");
    }

    public Long getId() {
        return id;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public Long getPacienteId() {
        return pacienteId;
    }

    public Long getMedicoId() {
        return medicoId;
    }

    public CitaEstado getEstado() {
        return estado;
    }

    public Cita withId(Long nuevoId) {
        return new Cita(nuevoId, this.fechaHora, this.pacienteId, this.medicoId, this.estado);
    }

    public Cita withEstado(CitaEstado nuevoEstado) {
        return new Cita(this.id, this.fechaHora, this.pacienteId, this.medicoId, nuevoEstado);
    }
}
