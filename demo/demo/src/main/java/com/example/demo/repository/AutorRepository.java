package com.example.demo.repository;

import com.example.demo.model.Autor;
import com.example.demo.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AutorRepository extends JpaRepository<Autor, Livro> {
    Autor findById(Long id);
}
