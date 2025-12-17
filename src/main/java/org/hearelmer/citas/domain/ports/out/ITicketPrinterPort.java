package org.hearelmer.citas.domain.ports.out;

import org.hearelmer.citas.domain.model.Cita;

public interface ITicketPrinterPort {

    void imprimirTicket(Cita cita);
}
