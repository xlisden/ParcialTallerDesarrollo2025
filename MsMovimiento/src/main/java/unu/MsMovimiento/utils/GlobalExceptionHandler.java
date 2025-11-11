package unu.MsMovimiento.utils;

import unu.MsMovimiento.utils.exceptions.CustomException;
import unu.MsMovimiento.utils.exceptions.NotFoundException;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Log4j2
@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(CustomException.class)
    public ResponseEntity<String> handleCustomExceptionExceptions(CustomException exp) {
        log.error("CustomException {} \n {}", exp.getMessage(), exp.getStackTrace()[0]);
        return new ResponseEntity<>(exp.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<String> handleNotFoundExceptions(NotFoundException exp) {
        log.error("NotFoundException {} \n {}", exp.getMessage(), exp.getStackTrace()[0]);
        return new ResponseEntity<>(exp.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleGlobalExceptions(Exception exp) {
        log.error("Exception {} \n {}", exp.getMessage(), exp.getStackTrace()[0]);
        return new ResponseEntity<>(exp.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
