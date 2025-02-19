package com.manoslocales.ManosLocales.Ecommerce.Exceptions;

import org.springframework.http.HttpStatus;
import java.time.ZonedDateTime;

public class JavaException {
    private final String message;
    private final HttpStatus httpStatus;
    private final ZonedDateTime zonedDateTime;

    public JavaException(String message, HttpStatus httpStatus, ZonedDateTime zonedDateTime) {
        this.message = message;
        this.httpStatus = httpStatus;
        this.zonedDateTime = zonedDateTime;
    }

    public String getMessage() {
        return this.message;
    }

    public HttpStatus getHttpStatus() {
        return this.httpStatus;
    }

    public ZonedDateTime getZonedDateTime() {
        return this.zonedDateTime;
    }
}
