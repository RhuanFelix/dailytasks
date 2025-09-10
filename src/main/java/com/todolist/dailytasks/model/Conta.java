package com.todolist.dailytasks.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "conta")
@Getter
@Setter
public class Conta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(value = AccessLevel.NONE)
    private int id;

    @Column(nullable = false, length = 255)
    private String senha;

    @OneToOne
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;

    protected Conta() {}

    public Conta(String senha, Usuario usuario) {
        this.senha = senha;
        this.usuario = usuario;
    }

}
