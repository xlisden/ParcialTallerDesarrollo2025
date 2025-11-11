package unu.MsArticulo.model;

import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import unu.MsArticulo.model.dto.ArticuloDto;

import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "articulo")
public class Articulo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private int idArticulo;

    @Column(length = 100, nullable = false)
    private String nombre;

    private double precio;

    public ArticuloDto getDto() {
        ArticuloDto dto = new ArticuloDto();
        dto.setIdArticulo(this.getIdArticulo());
        dto.setNombre(this.getNombre());
        dto.setPrecio(this.getPrecio());
        return dto;
    }

}
