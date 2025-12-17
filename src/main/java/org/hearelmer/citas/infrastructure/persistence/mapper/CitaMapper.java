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
                .idCita(cita.getIdCita())
                .fechaRegistro(cita.getFechaRegistro())
                .fechaProgramada(cita.getFechaProgramada())
                .estado(cita.getEstado())
                .build();
    }

    public Cita toDomain(CitaJpaEntity entity) {
        if (entity == null) {
            return null;
        }
        return new Cita(
                entity.getIdCita(),
                entity.getFechaRegistro(),
                entity.getFechaProgramada(),
                entity.getEstado()
        );
    }
}
