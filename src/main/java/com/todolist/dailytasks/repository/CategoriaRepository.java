package com.todolist.dailytasks.repository;

import com.todolist.dailytasks.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
}
