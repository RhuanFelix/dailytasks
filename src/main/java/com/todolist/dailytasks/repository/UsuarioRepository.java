package com.todolist.dailytasks.repository;

import com.todolist.dailytasks.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}
