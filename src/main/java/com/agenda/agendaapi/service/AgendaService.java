package com.agenda.agendaapi.service;

import com.agenda.agendaapi.expection.AgendaNotFoundException;
import com.agenda.agendaapi.model.Agenda;
import com.agenda.agendaapi.repository.AgendaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class AgendaService {

    private final AgendaRepository repository;

    public AgendaService(AgendaRepository repository) {
        this.repository = repository;
    }

    public Agenda marcar(Agenda agenda) {
        return repository.save(agenda);
    }

    public void desmarcar(UUID id) {
        Agenda agenda = repository.findById((id)).orElseThrow(() -> new AgendaNotFoundException(id));;

        agenda.setCancelado(true);
        repository.save(agenda);
    }

    public List<Agenda> listar() {
        return repository.findAll();
    }

    public Optional<Agenda> obterID(UUID id) {
        return Optional.ofNullable(repository.findById(id).orElseThrow(() -> new AgendaNotFoundException(id)));

    }

}
