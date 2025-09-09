package com.todolist.dailytasks.repository;

import com.todolist.dailytasks.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<Tarefa, Integer> {
}
