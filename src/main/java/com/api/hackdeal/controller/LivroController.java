package com.api.hackdeal.controller;

import com.api.hackdeal.model.Categoria;
import com.api.hackdeal.model.Livro;
import com.api.hackdeal.repository.CategoriaRepository;
import com.api.hackdeal.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/api")
public class LivroController {

    @Autowired
    LivroRepository livroRepository;

    @GetMapping("/livros")
    public List<Livro> listaLivros(){
        return livroRepository.findAll();
    }

    @GetMapping("/livro/{id}")
    public Livro listaUmProduto(@PathVariable(value = "id") int id){
        return livroRepository.findById(id);
    }

    @PostMapping("/livro")
    public Livro salvaLivro(@RequestBody Livro livro){
        return livroRepository.save(livro);
    }

    @DeleteMapping("/livro")
    public void deletaLivro(@RequestBody Livro livro){
        livroRepository.delete(livro);
    }

    @PutMapping("/livro")
    public Livro alteraLivro(@RequestBody Livro livro){
        return livroRepository.save(livro);
    }




    @Autowired
    CategoriaRepository categoriaRepository;

    @GetMapping("/categorias")
    public List<Categoria> listaCategoria(){
        return categoriaRepository.findAll();
    }

    @GetMapping("/categoria/{id}")
    public Categoria listaUmaCategoria(@PathVariable(value = "id") int id){
        return categoriaRepository.findById(id);
    }

    @PostMapping("/categoria")
    public Categoria salvaCategoria(@RequestBody Categoria categoria){
        return categoriaRepository.save(categoria);
    }

    @DeleteMapping("/categoria")
    public String deletaCategoria(@RequestBody Categoria categoria){
        categoriaRepository.delete(categoria);
        return "Deletado com sucesso";
    }

    @PutMapping("/categoria")
    public Categoria alteraCategoria(@RequestBody Categoria categoria){
        return categoriaRepository.save(categoria);
    }

}
