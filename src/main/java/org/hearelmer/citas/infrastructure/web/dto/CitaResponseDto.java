package org.hearelmer.citas.infrastructure.web.dto;

import java.time.LocalDateTime;

public class CitaResponseDto {

    private Integer idCita;
    private LocalDateTime fechaRegistro;
    private LocalDateTime fechaProgramada;
    private String estado;

    public CitaResponseDto() {
    }

    public CitaResponseDto(Integer idCita, LocalDateTime fechaRegistro, LocalDateTime fechaProgramada, String estado) {
        this.idCita = idCita;
        this.fechaRegistro = fechaRegistro;
        this.fechaProgramada = fechaProgramada;
        this.estado = estado;
    }

    public Integer getIdCita() {
        return idCita;
    }

    public void setIdCita(Integer idCita) {
        this.idCita = idCita;
    }

    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDateTime fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public LocalDateTime getFechaProgramada() {
        return fechaProgramada;
    }

    public void setFechaProgramada(LocalDateTime fechaProgramada) {
        this.fechaProgramada = fechaProgramada;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
