package org.example;

public class InvalidCardException extends RuntimeException{
    public InvalidCardException(String message) {
        super(message);
    }
}
