package org.hearelmer.citas.infrastructure.web.dto;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDateTime;

public class CitaRequestDto {

    @NotNull
    @FutureOrPresent
    private LocalDateTime fechaProgramada;

    private String estado;

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
