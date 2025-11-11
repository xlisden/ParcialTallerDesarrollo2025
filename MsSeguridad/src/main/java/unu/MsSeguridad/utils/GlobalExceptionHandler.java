package unu.MsSeguridad.utils;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import unu.MsSeguridad.utils.exceptions.UnauthorizedException;

@Log4j2
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(UnauthorizedException.class)
    public ResponseEntity<String> handleNotFoundExceptions(UnauthorizedException exp) {
        log.error("UnauthorizedException {} \n {}", exp.getMessage(), exp.getStackTrace()[0]);
        return new ResponseEntity<>(exp.getMessage(), HttpStatus.UNAUTHORIZED);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleGlobalExceptions(Exception exp) {
        log.error("Exception {} \n {}", exp.getMessage(), exp.getStackTrace()[0]);
        return new ResponseEntity<>(exp.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
