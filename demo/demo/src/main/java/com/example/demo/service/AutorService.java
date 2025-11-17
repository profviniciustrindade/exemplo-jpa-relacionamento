package com.example.demo.service;

import com.example.demo.dto.AutorRespostaDto;
import com.example.demo.mapper.AutorMapper;
import com.example.demo.repository.AutorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AutorService {
    private final AutorRepository repository;

    private final AutorMapper mapper;

    public AutorRespostaDto getAutorById(Long id){
        return mapper.toRespostaDto(repository.findById(id));
    }
}
