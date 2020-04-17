package com.api.hackdeal.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "livro")
public class Livro {
    @Id
    private int id;
    private String nome;
    private float preco;
    private int paginas;
    private int codigo;
    private int id_categoria;
}
