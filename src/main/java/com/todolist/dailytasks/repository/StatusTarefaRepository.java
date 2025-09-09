package com.todolist.dailytasks.repository;

import com.todolist.dailytasks.model.StatusTarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusTarefaRepository extends JpaRepository<StatusTarefa, Integer> {
}
