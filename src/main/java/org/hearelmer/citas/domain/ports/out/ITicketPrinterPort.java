package org.hearelmer.citas.domain.ports.out;

import org.hearelmer.citas.domain.model.Ticket;

public interface ITicketPrinterPort {

    void imprimir(Ticket ticket);
}
