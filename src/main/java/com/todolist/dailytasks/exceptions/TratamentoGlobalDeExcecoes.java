package com.todolist.dailytasks.exceptions;

import com.todolist.dailytasks.exceptions.categoria.CategoriaJaExistenteException;
import com.todolist.dailytasks.exceptions.categoria.CategoriaNaoEncontradaException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class TratamentoGlobalDeExcecoes {

    @ExceptionHandler(CategoriaJaExistenteException.class)
    public ResponseEntity<String> tratarCategoriaJaExistenteException(CategoriaJaExistenteException ex) {
        return ResponseEntity.status(HttpStatus.CONFLICT).body(ex.getMessage());
    }

    @ExceptionHandler(CategoriaNaoEncontradaException.class)
    public ResponseEntity<String> tratarCategoriaNaoEncontradaException(CategoriaNaoEncontradaException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
    }
}
