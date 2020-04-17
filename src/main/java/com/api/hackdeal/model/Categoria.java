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
@Table(name="categoria")
public class Categoria {
    @Id
    private int id;
    private String nome;
}
