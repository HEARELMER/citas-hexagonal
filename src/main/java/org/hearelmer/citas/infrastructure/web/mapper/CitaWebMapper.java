package org.hearelmer.citas.infrastructure.web.mapper;

import java.time.LocalDateTime;
import org.hearelmer.citas.domain.model.Cita;
import org.hearelmer.citas.infrastructure.web.dto.CitaRequestDto;
import org.hearelmer.citas.infrastructure.web.dto.CitaResponseDto;
import org.springframework.stereotype.Component;

@Component
public class CitaWebMapper {

    public Cita toDomain(CitaRequestDto request) {
        if (request == null) {
            return null;
        }
        String estado = request.getEstado() != null ? request.getEstado() : "PENDIENTE";
        return new Cita(
                null,
                LocalDateTime.now(),
                request.getFechaProgramada(),
                estado
        );
    }

    public CitaResponseDto toResponse(Cita cita) {
        if (cita == null) {
            return null;
        }
        return new CitaResponseDto(
                cita.getIdCita(),
                cita.getFechaRegistro(),
                cita.getFechaProgramada(),
                cita.getEstado()
        );
    }
}
