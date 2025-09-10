package com.todolist.dailytasks.model;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Table(name = "categoria")
@Getter
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 100)
    private String titulo;

    protected Categoria() {}

    public Categoria(String titulo) {
        this.titulo = titulo;
    }

    // este setter será utilizado para normalizar os nomes das categorias no banco para minúsculo
    public void setTitulo(String titulo) {
        this.titulo = titulo == null ? null : titulo.toLowerCase();
    }
}
