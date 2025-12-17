package org.hearelmer.citas.infrastructure.persistence.mapper;

import org.hearelmer.citas.domain.model.Cita;
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
                .fechaHora(cita.getFechaHora())
                .pacienteId(cita.getPacienteId())
                .medicoId(cita.getMedicoId())
                .estado(cita.getEstado())
                .build();
    }

    public Cita toDomain(CitaJpaEntity entity) {
        if (entity == null) {
            return null;
        }
        return new Cita(
                entity.getId(),
                entity.getFechaHora(),
                entity.getPacienteId(),
                entity.getMedicoId(),
                entity.getEstado()
        );
    }
}
