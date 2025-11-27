package com.example.demo.mapper;

import com.example.demo.dto.pessoa.DocumentoRequestDto;
import com.example.demo.model.Documento;
import org.springframework.stereotype.Component;

@Component
public class DocumentoMapper {
    public Documento toEntity(DocumentoRequestDto documentoRequestDto){
        return new Documento(documentoRequestDto.numero()
                ,documentoRequestDto.tipo());
    }
}
