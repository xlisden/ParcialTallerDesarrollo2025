package unu.MsMovimiento.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MovimientoDto {
    private int idMovimiento;

    private int idArticulo;

    private String tipoMovimiento;

    private int cantidad;

    private String estado;
}
