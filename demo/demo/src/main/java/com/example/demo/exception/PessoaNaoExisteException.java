package com.example.demo.exception;

public class PessoaNaoExisteException extends IllegalArgumentException {
    public PessoaNaoExisteException() {
        super("Pessoa não econtrada!");
    }
}
