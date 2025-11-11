package unu.MsSeguridad.controller;

import unu.MsSeguridad.controller.request.SeguridadRequest;
import unu.MsSeguridad.model.Seguridad;
import unu.MsSeguridad.service.ISeguridadService;
import unu.MsSeguridad.utils.ApiRoutes;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Log4j2
@RestController
@AllArgsConstructor
@RequestMapping(ApiRoutes.SeguridadRoutes.BASE)
public class SeguridadController {

    private ISeguridadService service;

    @PostMapping(ApiRoutes.SeguridadRoutes.login)
    public ResponseEntity<String> login(@RequestBody SeguridadRequest request) {
        String mensaje = service.login(request);
        return ResponseEntity.status(HttpStatus.OK).body(mensaje);
    }

    @GetMapping
    public ResponseEntity<List<Seguridad>> getAll() {
        return ResponseEntity.status(HttpStatus.OK).body(service.getAll());
    }

}
