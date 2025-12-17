package org.hearelmer.citas.infrastructure.persistence.jpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "citas")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CitaJpaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cita")
    private Integer idCita;

    @Column(name = "fecha_registro", nullable = false)
    private LocalDateTime fechaRegistro;

    @Column(name = "fecha_programada", nullable = false)
    private LocalDateTime fechaProgramada;

    @Column(nullable = false)
    private String estado;
}
