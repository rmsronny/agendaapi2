package com.agenda.agendaapi.controller;

import com.agenda.agendaapi.repository.AgendaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/agenda")
public class AgendaWebController {

    @GetMapping
    public String webAgenda() {
        return "agenda";
    }
}




