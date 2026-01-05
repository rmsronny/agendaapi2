package com.agenda.agendaapi.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class Agenda

{
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column
    private String data;

    @Column
    private String horario;

    @Column
    private String descricao;

    private boolean cancelado = false;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Agenda{" +
                "id=" + id +
                ", data='" + data + '\'' +
                ", horario='" + horario + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }

    public Boolean getCancelado() {
        return cancelado;
    }
    public void setCancelado(Boolean cancelado) {
        this.cancelado = cancelado;
    }
}
