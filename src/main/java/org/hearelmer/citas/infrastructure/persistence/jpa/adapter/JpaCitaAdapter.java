package org.hearelmer.citas.infrastructure.persistence.jpa.adapter;

import lombok.RequiredArgsConstructor;
import org.hearelmer.citas.domain.model.Cita;
import org.hearelmer.citas.domain.ports.out.ICitaRepositoryPort;
import org.hearelmer.citas.infrastructure.persistence.jpa.entity.CitaJpaEntity;
import org.hearelmer.citas.infrastructure.persistence.jpa.repository.SpringDataCitaRepository;
import org.hearelmer.citas.infrastructure.persistence.mapper.CitaMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class JpaCitaAdapter implements ICitaRepositoryPort {

    private final SpringDataCitaRepository springDataCitaRepository;
    private final CitaMapper mapper;

    @Override
    public Cita guardar(Cita cita) {
        CitaJpaEntity entity = mapper.toEntity(cita);
        CitaJpaEntity persisted = springDataCitaRepository.save(entity);
        return mapper.toDomain(persisted);
    }
}
