package org.hearelmer.citas.infrastructure.web.dto;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDateTime;
import org.hearelmer.citas.domain.model.CitaEstado;

public class CitaRequestDto {

    @NotNull
    @FutureOrPresent
    private LocalDateTime fechaHora;

    @NotNull
    private Long pacienteId;

    @NotNull
    private Long medicoId;

    private CitaEstado estado;

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Long getPacienteId() {
        return pacienteId;
    }

    public void setPacienteId(Long pacienteId) {
        this.pacienteId = pacienteId;
    }

    public Long getMedicoId() {
        return medicoId;
    }

    public void setMedicoId(Long medicoId) {
        this.medicoId = medicoId;
    }

    public CitaEstado getEstado() {
        return estado;
    }

    public void setEstado(CitaEstado estado) {
        this.estado = estado;
    }
}
