package org.hearelmer.citas.domain.ports.in;

import org.hearelmer.citas.domain.model.Cita;

public interface ICreateCitaCmd {

    Cita ejecutar(Cita cita);
}
