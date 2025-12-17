package org.hearelmer.citas.application.usecase;

import lombok.RequiredArgsConstructor;
import org.hearelmer.citas.domain.model.Cita;
import org.hearelmer.citas.domain.ports.in.ICreateCitaCmd;
import org.hearelmer.citas.domain.ports.out.ICitaRepositoryPort;
import org.hearelmer.citas.domain.ports.out.ITicketPrinterPort;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CrearCitaUseCase implements ICreateCitaCmd {

    private final ICitaRepositoryPort citaRepositoryPort;
    private final ITicketPrinterPort ticketPrinterPort;

    @Override
    public Cita ejecutar(Cita cita) {
        Cita citaGuardada = citaRepositoryPort.guardar(cita);
        ticketPrinterPort.imprimirTicket(citaGuardada);
        return citaGuardada;
    }
}
