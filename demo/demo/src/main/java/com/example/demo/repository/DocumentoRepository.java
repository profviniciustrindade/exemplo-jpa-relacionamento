package com.example.demo.repository;

import com.example.demo.model.Documento;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.print.Doc;

public interface DocumentoRepository extends JpaRepository<Documento, Long> {
    boolean existsByNumero(int numero);
}
