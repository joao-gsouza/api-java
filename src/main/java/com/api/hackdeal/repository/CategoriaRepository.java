package com.api.hackdeal.repository;

import com.api.hackdeal.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

    Categoria findById(int id);

}
