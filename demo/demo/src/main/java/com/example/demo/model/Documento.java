package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Documento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int numero;

    private String tipo;

    @OneToOne(mappedBy = "documento")
    private Pessoa pessoa;

    public Documento(int numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
    }
}
