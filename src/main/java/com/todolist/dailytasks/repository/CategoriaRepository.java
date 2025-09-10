package com.todolist.dailytasks.repository;

import com.todolist.dailytasks.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
    Optional<Categoria> findByTitulo(String titulo);
}
