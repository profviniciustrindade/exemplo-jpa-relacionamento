package com.example.demo.dto.pessoa;

public record PessoaResponseDto(
        String nome,
        DocumentoResponseDto documento
) {
}
