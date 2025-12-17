package org.hearelmer.citas.application.usecase;

import lombok.RequiredArgsConstructor;
import org.hearelmer.citas.domain.model.Cita;
import org.hearelmer.citas.domain.model.Ticket;
import org.hearelmer.citas.domain.ports.in.IReservarCitaCmd;
import org.hearelmer.citas.domain.ports.out.ICitaRepositoryPort;
import org.hearelmer.citas.domain.ports.out.ITicketPrinterPort;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReservarCitaUseCase implements IReservarCitaCmd {

    private final ICitaRepositoryPort citaRepositoryPort;
    private final ITicketPrinterPort ticketPrinterPort;

    @Override
    public void ejecutar(Cita cita) {
        citaRepositoryPort.save(cita);
        Ticket ticket = cita.generarTicket();
        ticketPrinterPort.imprimir(ticket);
    }
}
