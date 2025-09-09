package com.todolist.dailytasks.repository;

import com.todolist.dailytasks.model.Conta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContaRepository extends JpaRepository<Conta, Integer> {
}
