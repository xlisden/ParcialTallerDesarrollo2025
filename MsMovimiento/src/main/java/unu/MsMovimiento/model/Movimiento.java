package unu.MsMovimiento.model;

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
import unu.MsMovimiento.model.dto.MovimientoDto;

import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "movimiento")
public class Movimiento implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private int idMovimiento;

    private int idArticulo;

    @Column(length = 100, nullable = false)
    private String tipoMovimiento;

    private int cantidad;

    @Column(length = 100, nullable = false)
    private String estado;

    public MovimientoDto getDto() {
        MovimientoDto dto = new MovimientoDto();
        dto.setIdMovimiento(this.getIdMovimiento());
        dto.setIdArticulo(this.getIdArticulo());
        dto.setTipoMovimiento(this.getTipoMovimiento());
        dto.setCantidad(this.getCantidad());
        dto.setEstado(this.getEstado());
        return dto;
    }
}
