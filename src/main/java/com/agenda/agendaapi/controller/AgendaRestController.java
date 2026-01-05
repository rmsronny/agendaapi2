package com.agenda.agendaapi.controller;

import com.agenda.agendaapi.model.Agenda;
import com.agenda.agendaapi.repository.AgendaRepository;
import com.agenda.agendaapi.service.AgendaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;
import java.util.List;

@RestController
@RequestMapping("/api/agenda")
public class AgendaRestController {

    private final AgendaService service;

    public AgendaRestController(AgendaService service) {
        this.service = service;
    }


    @PostMapping
    public ResponseEntity<Agenda> marcar(
            @RequestBody Agenda agenda) {

        return ResponseEntity.status(HttpStatus.CREATED).body(service.marcar(agenda));
    }


    @PutMapping("/{id}/cancelar")
    public ResponseEntity<Void> desmarcar(@PathVariable UUID id) {
        service.desmarcar(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public Optional<Agenda> obterId(@PathVariable("id")UUID id) {
        return service.obterID(id);
    }


    @GetMapping
    public ResponseEntity<List<Agenda>> listar() {
        return ResponseEntity.ok(service.listar());
    }
}





