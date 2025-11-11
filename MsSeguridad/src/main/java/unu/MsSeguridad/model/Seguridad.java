package unu.MsSeguridad.model;

import org.springframework.data.annotation.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "seguridad")
public class Seguridad implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private int idUsuario;

    private String nombre;

    private String clave;

}
