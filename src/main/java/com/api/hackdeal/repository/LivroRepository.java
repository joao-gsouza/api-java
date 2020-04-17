package com.api.hackdeal.repository;

import com.api.hackdeal.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {

    Livro findById(int id);

}
