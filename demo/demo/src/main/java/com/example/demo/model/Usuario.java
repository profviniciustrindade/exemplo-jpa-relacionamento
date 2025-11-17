package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToOne(cascade = CascadeType.ALL) // todas as alterações afetaram as entidadesa relacionadas.
    private Endereco endereco;

    @ManyToMany
    @JoinTable(
            name = "estudante_curso",  // Nome da tabela intermediária
            joinColumns = @JoinColumn(name = "estudante_id"), // FK para a tabela Estudante
            inverseJoinColumns = @JoinColumn(name = "curso_id") // FK para a tabela Curso
    )
    private List<Curso> cursos;
}
