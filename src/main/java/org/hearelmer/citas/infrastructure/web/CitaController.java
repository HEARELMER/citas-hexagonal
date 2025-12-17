package org.hearelmer.citas.infrastructure.web;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.hearelmer.citas.domain.model.Cita;
import org.hearelmer.citas.domain.ports.in.IReservarCitaCmd;
import org.hearelmer.citas.infrastructure.web.dto.CitaRequestDto;
import org.hearelmer.citas.infrastructure.web.mapper.CitaWebMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/citas")
@RequiredArgsConstructor
public class CitaController {

    private final IReservarCitaCmd reservarCitaCmd;
    private final CitaWebMapper mapper;

    @PostMapping
    public ResponseEntity<Void> reservar(@Valid @RequestBody CitaRequestDto request) {
        Cita cita = mapper.toDomain(request);
        reservarCitaCmd.ejecutar(cita);
        return ResponseEntity.status(201).build();
    }
}
