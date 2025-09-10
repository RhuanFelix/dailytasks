package com.todolist.dailytasks.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "usuario")
@Getter
@Setter
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(value = AccessLevel.NONE) // impede que o lombok faça um setter para este atributo
    private int id;

    @Column(nullable = false, length = 150)
    private String nome;

    @Column(nullable = false, length = 100, unique = true)
    private String email;

    @Column(name = "tipo_usuario", length = 10, nullable = false)
    private String tipoUsuario = "comum";

    protected Usuario() {}

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }
}
