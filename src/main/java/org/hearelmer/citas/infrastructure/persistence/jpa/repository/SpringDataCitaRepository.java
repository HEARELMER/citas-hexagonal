package org.hearelmer.citas.infrastructure.persistence.jpa.repository;

import org.hearelmer.citas.infrastructure.persistence.jpa.entity.CitaJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringDataCitaRepository extends JpaRepository<CitaJpaEntity, Long> {
}
