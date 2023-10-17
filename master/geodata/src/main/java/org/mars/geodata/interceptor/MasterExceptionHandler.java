package org.mars.geodata.interceptor;

import org.mars.geodata.exception.CityErrorResponse;
import org.mars.geodata.exception.CityNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MasterExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<CityErrorResponse> cityErrorResponseHandler(CityNotFoundException exc) {
        CityErrorResponse error = new CityErrorResponse();

        error.setStatus(HttpStatus.NOT_FOUND.value());
        error.setMessage(exc.getMessage());
        error.setTimestamp(System.currentTimeMillis());

        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<CityErrorResponse> cityErrorResponseHandler(Exception exc) {
        CityErrorResponse error = new CityErrorResponse();

        error.setStatus(HttpStatus.BAD_REQUEST.value());
        error.setMessage(exc.getMessage());
        error.setTimestamp(System.currentTimeMillis());

        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }
}
