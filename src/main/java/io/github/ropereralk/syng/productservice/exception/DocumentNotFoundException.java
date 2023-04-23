package io.github.ropereralk.syng.productservice.exception;

import org.springframework.http.HttpStatus;

public class DocumentNotFoundException extends Exception{

    public DocumentNotFoundException(HttpStatus httpStatus ,String message){
        super(message);
    }
}
