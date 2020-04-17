package com.api.hackdeal.controller;

import com.api.hackdeal.model.Livro;
import com.api.hackdeal.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
