package org.hearelmer.citas.infrastructure.hardware;

import org.hearelmer.citas.domain.model.Ticket;
import org.hearelmer.citas.domain.ports.out.ITicketPrinterPort;
import org.springframework.stereotype.Component;

@Component
public class ThermalPrinterAdapter implements ITicketPrinterPort {

    @Override
    public void imprimir(Ticket ticket) {
        System.out.println("[ThermalPrinter] Imprimiendo ticket codigoBarra=" + ticket.getCodigoBarra());
    }
}
