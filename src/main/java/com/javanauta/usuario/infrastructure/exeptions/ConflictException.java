package com.javanauta.usuario.infrastructure.exeptions;

public class ConflictException extends RuntimeException {

    public ConflictException(String message) {
        super(message);
    }

    public ConflictException(String mensage, Throwable throwable){
        super(mensage);
    }
}
