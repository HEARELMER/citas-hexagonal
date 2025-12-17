package org.hearelmer.citas.infrastructure.web.mapper;

import org.hearelmer.citas.domain.model.Cita;
import org.hearelmer.citas.domain.model.CitaEstado;
import org.hearelmer.citas.infrastructure.web.dto.CitaRequestDto;
import org.hearelmer.citas.infrastructure.web.dto.CitaResponseDto;
import org.springframework.stereotype.Component;

@Component
public class CitaWebMapper {

    public Cita toDomain(CitaRequestDto request) {
        if (request == null) {
            return null;
        }
        CitaEstado estado = request.getEstado() != null ? request.getEstado() : CitaEstado.PENDIENTE;
        return new Cita(
                null,
                request.getFechaHora(),
                request.getPacienteId(),
                request.getMedicoId(),
                estado
        );
    }

    public CitaResponseDto toResponse(Cita cita) {
        if (cita == null) {
            return null;
        }
        return new CitaResponseDto(
                cita.getId(),
                cita.getFechaHora(),
                cita.getPacienteId(),
                cita.getMedicoId(),
                cita.getEstado()
        );
    }
}
