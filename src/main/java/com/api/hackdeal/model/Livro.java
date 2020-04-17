package com.api.hackdeal.model;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name = "livro")
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private float preco;
    private int paginas;
    private int codigo;
    private int id_categoria;
}
