package unu.MsMovimiento.service;

import unu.MsMovimiento.controller.request.ActualizarEstadoRequest;
import unu.MsMovimiento.model.Movimiento;
import unu.MsMovimiento.model.dto.MovimientoDto;

public interface IMovimientoService {

    public Movimiento getById(int id);

    public MovimientoDto actualizarEstado(int id, ActualizarEstadoRequest request);

}
