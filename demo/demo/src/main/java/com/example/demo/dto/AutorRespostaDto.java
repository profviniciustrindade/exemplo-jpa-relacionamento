package com.example.demo.dto;

import java.util.List;

public record AutorRespostaDto(
        Long id,
        String nome,
        List<LivroRespostaDto> livros
) {
}
