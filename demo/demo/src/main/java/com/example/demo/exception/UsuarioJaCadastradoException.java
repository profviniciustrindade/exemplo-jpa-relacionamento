package com.example.demo.exception;

public class UsuarioJaCadastradoException extends RuntimeException{
    public UsuarioJaCadastradoException(){
        super("Usuário inválido");
    }
}
