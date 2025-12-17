package org.hearelmer.citas.infrastructure.web.dto;

import java.time.LocalDateTime;
import org.hearelmer.citas.domain.model.CitaEstado;

public class CitaResponseDto {

    private Long id;
    private LocalDateTime fechaHora;
    private Long pacienteId;
    private Long medicoId;
    private CitaEstado estado;

    public CitaResponseDto() {
    }

    public CitaResponseDto(Long id, LocalDateTime fechaHora, Long pacienteId, Long medicoId, CitaEstado estado) {
        this.id = id;
        this.fechaHora = fechaHora;
        this.pacienteId = pacienteId;
        this.medicoId = medicoId;
        this.estado = estado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
