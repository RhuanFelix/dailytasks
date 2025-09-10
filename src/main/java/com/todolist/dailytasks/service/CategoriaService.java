package com.todolist.dailytasks.service;

import com.todolist.dailytasks.exceptions.categoria.CategoriaJaExistenteException;
import com.todolist.dailytasks.exceptions.categoria.CategoriaNaoEncontradaException;
import com.todolist.dailytasks.model.Categoria;
import com.todolist.dailytasks.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;

    public Categoria salvarCategoria(Categoria categoria) {
        Optional<Categoria> resultadoOptional = pesquisarCategoriaPorTitulo(categoria.getTitulo());
        if (resultadoOptional.isPresent()) {
            throw new CategoriaJaExistenteException("Esta categoria já existe!");
        }
        return categoriaRepository.save(categoria);
    }

    public List<Categoria> listarTodasAsCategorias() {
        return categoriaRepository.findAll();
    }

    public Optional<Categoria> pesquisarCategoriaPorTitulo(String titulo) {
        return categoriaRepository.findByTitulo(titulo.toLowerCase());
    }

    public Categoria atualizarTitulo(String titulo, Categoria atualizarCategoria) {
        Categoria categoriaExistente = pesquisarCategoriaPorTitulo(titulo)
                .orElseThrow(() -> new CategoriaNaoEncontradaException("Categoria não encontrada!"));
        categoriaExistente.setTitulo(atualizarCategoria.getTitulo());
        return categoriaRepository.save(categoriaExistente);
    }

    public void deletarCategoria(String titulo) {
        Categoria categoria = pesquisarCategoriaPorTitulo(titulo)
                .orElseThrow(() -> new CategoriaNaoEncontradaException("Categoria não encontrada!"));
        categoriaRepository.delete(categoria);
    }
}