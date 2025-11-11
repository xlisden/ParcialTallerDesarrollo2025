package unu.MsMovimiento.service;

import unu.MsMovimiento.controller.request.ActualizarEstadoRequest;
import unu.MsMovimiento.model.Movimiento;

public interface IMovimientoService {

    public Movimiento getById(int id);

    public Movimiento actualizarEstado(int id, ActualizarEstadoRequest request);

}
