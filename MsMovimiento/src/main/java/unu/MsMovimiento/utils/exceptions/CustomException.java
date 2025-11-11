package unu.MsMovimiento.utils.exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomException extends RuntimeException{

    public CustomException(String mensaje) {
        super(mensaje);
    }

}
