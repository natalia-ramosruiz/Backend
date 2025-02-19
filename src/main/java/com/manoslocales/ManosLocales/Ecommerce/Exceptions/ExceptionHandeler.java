package com.manoslocales.ManosLocales.Ecommerce.Exceptions;


import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandeler {

    @ExceptionHandler(GeneralException.class)
    public ResponseEntity<Object> handleGeneralException(GeneralException e) {
        HttpStatus badRequest = HttpStatus.BAD_REQUEST;
        JavaException javaException = new JavaException(
                e.getMessage(),
                badRequest,
                ZonedDateTime.now(ZoneOffset.UTC)
        );
        return new ResponseEntity<>(javaException, badRequest);
    }
}
