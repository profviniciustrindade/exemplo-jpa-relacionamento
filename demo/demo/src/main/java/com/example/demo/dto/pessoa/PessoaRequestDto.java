package com.example.demo.dto.pessoa;

import com.example.demo.model.Documento;

public record PessoaRequestDto(
        String nome,
        DocumentoRequestDto documentoRequestDto
) {
}
