package com.javanauta.usuario.infrastructure.exeptions;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) {
        super(message);
    }

    public ResourceNotFoundException(String message, Throwable throwable){
        super(message, throwable);
    }
}
