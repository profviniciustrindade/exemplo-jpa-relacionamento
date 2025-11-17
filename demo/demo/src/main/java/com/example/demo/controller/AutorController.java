package com.example.demo.controller;

import com.example.demo.dto.AutorRespostaDto;
import com.example.demo.service.AutorService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/autor")
@AllArgsConstructor
public class AutorController {
    private final AutorService service;

    @GetMapping
    public ResponseEntity<AutorRespostaDto> getAutor(){
        return ResponseEntity.status(HttpStatus.OK)
                .body(service.getAutorById(1L));
    }

}
