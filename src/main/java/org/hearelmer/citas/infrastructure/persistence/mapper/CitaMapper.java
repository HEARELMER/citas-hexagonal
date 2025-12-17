package org.hearelmer.citas.infrastructure.persistence.mapper;

import org.hearelmer.citas.domain.model.Cita;
import org.hearelmer.citas.domain.valueObject.FechaHoraCita;
import org.hearelmer.citas.domain.valueObject.MedicoId;
import org.hearelmer.citas.domain.valueObject.PacienteId;
import org.hearelmer.citas.infrastructure.persistence.jpa.entity.CitaJpaEntity;
import org.springframework.stereotype.Component;

@Component
public class CitaMapper {

    public CitaJpaEntity toEntity(Cita cita) {
        if (cita == null) {
            return null;
        }
        return CitaJpaEntity.builder()
                .id(cita.getId())
            .fechaHora(cita.getFechaHora().value())
            .pacienteId(cita.getPacienteId().value())
            .medicoId(cita.getMedicoId().value())
                .estado(cita.getEstado())
                .build();
    }

    public Cita toDomain(CitaJpaEntity entity) {
        if (entity == null) {
            return null;
        }
        return new Cita(
                entity.getId(),
            new FechaHoraCita(entity.getFechaHora()),
            new PacienteId(entity.getPacienteId()),
            new MedicoId(entity.getMedicoId()),
                entity.getEstado()
        );
    }
}
