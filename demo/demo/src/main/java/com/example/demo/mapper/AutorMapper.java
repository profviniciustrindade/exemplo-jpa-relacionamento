package com.example.demo.mapper;

import com.example.demo.dto.AutorRespostaDto;
import com.example.demo.dto.LivroRespostaDto;
import com.example.demo.model.Autor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AutorMapper {
    public AutorRespostaDto toRespostaDto(Autor autor){
        List<LivroRespostaDto> livros = autor.getLivros()
                .stream()
                .map(l -> new LivroRespostaDto(l.getNome()))
                .toList();

        return new AutorRespostaDto(autor.getId(), autor.getNome(),livros);
    }
}
