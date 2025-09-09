package com.todolist.dailytasks.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "categoria")
@Getter
@Setter
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(value = AccessLevel.NONE)
    private int id;

    @Column(nullable = false, length = 100)
    private String titulo;

    public Categoria(String titulo) {
        this.titulo = titulo;
    }

}
