package com.example.demo;

import com.example.demo.service.EnderecoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/endereco")
@AllArgsConstructor
public class EnderecoController {
    private final EnderecoService enderecoService;
}
