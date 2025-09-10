package com.todolist.dailytasks.exceptions.categoria;

public class CategoriaJaExistenteException extends RuntimeException {
    public CategoriaJaExistenteException(String message) {
        super(message);
    }
}
