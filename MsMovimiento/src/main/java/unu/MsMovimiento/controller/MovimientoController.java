package unu.MsMovimiento.controller;

import unu.MsMovimiento.controller.request.ActualizarEstadoRequest;
import unu.MsMovimiento.model.Movimiento;
import unu.MsMovimiento.service.IMovimientoService;
import unu.MsMovimiento.utils.ApiRoutes;
import unu.MsMovimiento.utils.exceptions.NotFoundException;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Log4j2
@RestController
@AllArgsConstructor
@RequestMapping(ApiRoutes.MovimientoRoutes.BASE)
public class MovimientoController {

    private IMovimientoService service;

    @PutMapping(ApiRoutes.MovimientoRoutes.actualizarEstado)
    public ResponseEntity<Movimiento> actualizarEstado(@PathVariable int idMovimiento, @RequestBody ActualizarEstadoRequest request) throws NotFoundException {
        Movimiento movimiento = new Movimiento();
        log.info("MovimientoController-edit {}", request.toString());
        movimiento = service.actualizarEstado(idMovimiento, request);
        return ResponseEntity.status(HttpStatus.CREATED).body(movimiento);
    }


}
