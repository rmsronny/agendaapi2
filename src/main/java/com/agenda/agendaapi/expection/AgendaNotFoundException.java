package com.agenda.agendaapi.expection;
import java.util.UUID;

public class AgendaNotFoundException extends RuntimeException {

    public AgendaNotFoundException(UUID id) {
        super("Agenda não encontrada com id: " + id);
    }
}
