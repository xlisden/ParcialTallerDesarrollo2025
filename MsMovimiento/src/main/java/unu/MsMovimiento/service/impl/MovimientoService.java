package unu.MsMovimiento.service.impl;

import unu.MsMovimiento.controller.request.ActualizarEstadoRequest;
import unu.MsMovimiento.model.Movimiento;
import unu.MsMovimiento.model.dto.MovimientoDto;
import unu.MsMovimiento.repository.IMovimientoRepository;
import unu.MsMovimiento.service.IMovimientoService;
import unu.MsMovimiento.utils.Mensajes;
import unu.MsMovimiento.utils.exceptions.NotFoundException;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
@AllArgsConstructor
public class MovimientoService implements IMovimientoService {

    private IMovimientoRepository repository;

    @Override
    public Movimiento getById(int id) {
        return repository.findById(id).orElseThrow(() -> new NotFoundException(Mensajes.getMovNotFoundMessage(id)));
    }

    @Override
    public MovimientoDto actualizarEstado(int id, ActualizarEstadoRequest request) {
        Movimiento movimiento = getById(id);
        movimiento.setEstado(request.getEstado());
        movimiento = repository.save(movimiento);
        return movimiento.getDto();
    }
}