package com.agenda.agendaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.agenda.agendaapi.model.Agenda;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface AgendaRepository extends JpaRepository<Agenda, UUID> {


    Optional<Agenda> findById(UUID id);
}
