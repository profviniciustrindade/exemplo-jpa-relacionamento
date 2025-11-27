package com.example.demo.service;

import com.example.demo.dto.pessoa.PessoaRequestDto;
import com.example.demo.dto.pessoa.PessoaResponseDto;
import com.example.demo.exception.DocumentoJaExisteException;
import com.example.demo.exception.PessoaNaoExisteException;
import com.example.demo.exception.UsuarioJaCadastradoException;
import com.example.demo.mapper.DocumentoMapper;
import com.example.demo.mapper.PessoaMapper;
import com.example.demo.model.Documento;
import com.example.demo.model.Pessoa;
import com.example.demo.repository.DocumentoRepository;
import com.example.demo.repository.PessoaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class PessoaService {
    private final PessoaRepository pessoaRepository;

    private final DocumentoRepository documentoRepository;

    private final DocumentoMapper documentoMapper;

    private final PessoaMapper pessoaMapper;

    public PessoaResponseDto criarPessoa(PessoaRequestDto requestDto){
        if(documentoRepository.existsByNumero(requestDto.documentoRequestDto().numero())){
            throw new DocumentoJaExisteException();
        }

        if(pessoaRepository.existsByNome(requestDto.nome())){
            throw new UsuarioJaCadastradoException();
        }

        Documento documento = documentoRepository.save(
            documentoMapper.toEntity(
                    requestDto.documentoRequestDto())
        );

        Pessoa pessoa = pessoaMapper.toEntity(requestDto);

        pessoa.setDocumento(documento);

        return pessoaMapper.toResponseDto(pessoaRepository.save(pessoa));
    }

    public PessoaResponseDto buscarPessoaPorId(Long id){
        return pessoaMapper.toResponseDto(pessoaRepository.findById(id)
                .orElseThrow(() -> new PessoaNaoExisteException()));
    }
}
