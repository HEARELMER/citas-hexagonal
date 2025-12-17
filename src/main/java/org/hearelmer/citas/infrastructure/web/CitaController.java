package org.hearelmer.citas.infrastructure.web;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.hearelmer.citas.domain.model.Cita;
import org.hearelmer.citas.domain.ports.in.ICreateCitaCmd;
import org.hearelmer.citas.infrastructure.web.dto.CitaRequestDto;
import org.hearelmer.citas.infrastructure.web.dto.CitaResponseDto;
import org.hearelmer.citas.infrastructure.web.mapper.CitaWebMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/citas")
@RequiredArgsConstructor
public class CitaController {

    private final ICreateCitaCmd createCitaCmd;
    private final CitaWebMapper mapper;

    @PostMapping
    public ResponseEntity<CitaResponseDto> crearCita(@Valid @RequestBody CitaRequestDto request) {
        Cita cita = mapper.toDomain(request);
        Cita creada = createCitaCmd.ejecutar(cita);
        return ResponseEntity.status(HttpStatus.CREATED).body(mapper.toResponse(creada));
    }
}
