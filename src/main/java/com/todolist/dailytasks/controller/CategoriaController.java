package com.todolist.dailytasks.controller;

import com.todolist.dailytasks.model.Categoria;
import com.todolist.dailytasks.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {
    @Autowired
    private CategoriaService categoriaService;

    @GetMapping("/{titulo}")
    public Optional<Categoria> pesquisarCategoriaPorTitulo(@PathVariable String titulo) {
        return categoriaService.pesquisarCategoriaPorTitulo(titulo);
    }

    @GetMapping
    public List<Categoria> listarTodasAsCategorias() {
        return categoriaService.listarTodasAsCategorias();
    }

    @PostMapping
    public Categoria criarCategoria(@RequestBody Categoria categoria) {
        return categoriaService.salvarCategoria(categoria);
    }

    @PutMapping("/{titulo}")
    public Categoria atualizarCategoria(@PathVariable String titulo, @RequestBody Categoria categoria) {
        return categoriaService.atualizarTitulo(titulo, categoria);
    }

    @DeleteMapping("/{titulo}")
    public void deletarCategoria(@PathVariable String titulo) {
        categoriaService.deletarCategoria(titulo);
    }
}
