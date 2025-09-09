package com.todolist.dailytasks.model;

import jakarta.annotation.Generated;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "status_tarefa")
@Getter
@Setter
public class StatusTarefa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(value = AccessLevel.NONE)
    private int id;

    @Column(nullable = false, length = 9)
    private String nome;

    public StatusTarefa(String nome) {
        this.nome = nome;
    }

}
