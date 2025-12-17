package org.hearelmer.citas.infrastructure.web.mapper;

import org.hearelmer.citas.domain.model.Cita;
import org.hearelmer.citas.domain.model.CitaEstado;
import org.hearelmer.citas.domain.valueObject.FechaHoraCita;
import org.hearelmer.citas.domain.valueObject.MedicoId;
import org.hearelmer.citas.domain.valueObject.PacienteId;
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
            new FechaHoraCita(request.getFechaHora()),
            new PacienteId(request.getPacienteId()),
            new MedicoId(request.getMedicoId()),
                estado
        );
    }

    public CitaResponseDto toResponse(Cita cita) {
        if (cita == null) {
            return null;
        }
        return new CitaResponseDto(
                cita.getId(),
            cita.getFechaHora().value(),
            cita.getPacienteId().value(),
            cita.getMedicoId().value(),
                cita.getEstado()
        );
    }
}
