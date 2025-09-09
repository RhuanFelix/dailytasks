package com.todolist.dailytasks.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "tarefa")
@Getter
@Setter
public class Tarefa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(value = AccessLevel.NONE)
    private int id;

    @Column(nullable = false, length = 100)
    private String titulo;

    @Column
    private String descricao;

    @Column
    private LocalDate data;

    @ManyToOne
    @JoinColumn(name = "id_status_tarefa", nullable = false)
    private StatusTarefa statusTarefa;

    @ManyToOne
    @JoinColumn(name = "id_conta", nullable = false)
    private Conta conta;

    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private Categoria categoria;

    public Tarefa(String titulo, String descricao, LocalDate data, StatusTarefa statusTarefa, Conta conta, Categoria categoria) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.data = data;
        this.statusTarefa = statusTarefa;
        this.conta = conta;
        this.categoria = categoria;
    }

}
