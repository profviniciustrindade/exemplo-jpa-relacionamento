package com.example.demo.exception;

public class DocumentoJaExisteException extends RuntimeException{
    public DocumentoJaExisteException(){
        super("Documento inválido!");
    }
}
