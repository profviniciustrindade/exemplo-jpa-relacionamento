package com.example.demo.controller;

import com.example.demo.dto.pessoa.PessoaRequestDto;
import com.example.demo.dto.pessoa.PessoaResponseDto;
import com.example.demo.service.PessoaService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pessoa")
@AllArgsConstructor
public class PessoaController {
    private final PessoaService pessoaService;

    @PostMapping
    public ResponseEntity<PessoaResponseDto> criarPessoa(
            @RequestBody PessoaRequestDto pessoaRequestDto
    ){
        return ResponseEntity.status(HttpStatus.CREATED)
                        .body(pessoaService.criarPessoa(pessoaRequestDto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<PessoaResponseDto> buscarPessoaPorId(
            @PathVariable Long id
            ){
        return ResponseEntity.status(HttpStatus.OK)
                .body(pessoaService.buscarPessoaPorId(id));
    }

}
