package org.hearelmer.citas.domain.model;

import org.hearelmer.citas.domain.valueObject.FechaHoraCita;
import org.hearelmer.citas.domain.valueObject.MedicoId;
import org.hearelmer.citas.domain.valueObject.PacienteId;

import java.util.Objects;

/**
 * Entidad de dominio pura para la gestión de citas.
 */
public class Cita {

    private final Long id;
    private final FechaHoraCita fechaHora;
    private final PacienteId pacienteId;
    private final MedicoId medicoId;
    private final CitaEstado estado;

    public Cita(Long id, FechaHoraCita fechaHora, PacienteId pacienteId, MedicoId medicoId, CitaEstado estado) {
        this.id = id;
        this.fechaHora = Objects.requireNonNull(fechaHora, "fechaHora es requerida");
        this.pacienteId = Objects.requireNonNull(pacienteId, "pacienteId es requerido");
        this.medicoId = Objects.requireNonNull(medicoId, "medicoId es requerido");
        this.estado = Objects.requireNonNull(estado, "estado es requerido");
    }

    public Long getId() {
        return id;
    }

    public FechaHoraCita getFechaHora() {
        return fechaHora;
    }

    public PacienteId getPacienteId() {
        return pacienteId;
    }

    public MedicoId getMedicoId() {
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
