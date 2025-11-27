package com.example.demo.mapper;

import com.example.demo.dto.pessoa.DocumentoResponseDto;
import com.example.demo.dto.pessoa.PessoaRequestDto;
import com.example.demo.dto.pessoa.PessoaResponseDto;
import com.example.demo.dto.pessoa.PessoaRespostaDto;
import com.example.demo.model.Pessoa;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component

public class PessoaMapper {

    public Pessoa toEntity(PessoaRequestDto requestDto){
        return new Pessoa(
          requestDto.nome()
        );
    }

    public PessoaResponseDto toResponseDto(Pessoa pessoa){
        DocumentoResponseDto documentoResponseDto = new DocumentoResponseDto(
                pessoa.getDocumento().getNumero()
                ,pessoa.getDocumento().getTipo());

        return new PessoaResponseDto(pessoa.getNome(),
                documentoResponseDto);
    }
}
