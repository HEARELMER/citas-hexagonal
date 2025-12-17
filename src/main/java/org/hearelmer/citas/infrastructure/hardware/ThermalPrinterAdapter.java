package org.hearelmer.citas.infrastructure.hardware;

import lombok.extern.slf4j.Slf4j;
import org.hearelmer.citas.domain.model.Cita;
import org.hearelmer.citas.domain.ports.out.ITicketPrinterPort;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ThermalPrinterAdapter implements ITicketPrinterPort {

    @Override
    public void imprimirTicket(Cita cita) {
        // Simula impresión de ticket en la consola
        log.info("Imprimiendo ticket para la cita: id={}, fechaHora={}, pacienteId={}, medicoId={}, estado={}",
                cita.getId(), cita.getFechaHora(), cita.getPacienteId(), cita.getMedicoId(), cita.getEstado());
    }
}
