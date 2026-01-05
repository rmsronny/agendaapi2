package com.agenda.agendaapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AgendaApiApplication {


    @GetMapping("home-teste")
    public String testSpring() {
        return "Bem Vindo ao Spring";
    }

	public static void main(String[] args) {
		SpringApplication.run(AgendaApiApplication.class, args);
	}

}
