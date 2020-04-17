package com.api.hackdeal.model;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name="categoria")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
}
