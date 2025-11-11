package unu.MsArticulo.controller;

import unu.MsArticulo.controller.request.ArticuloRequest;
import unu.MsArticulo.model.Articulo;
import unu.MsArticulo.service.IArticuloService;
import unu.MsArticulo.utils.ApiRoutes;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Log4j2
@RestController
@AllArgsConstructor
@RequestMapping(ApiRoutes.ArticuloRoutes.BASE)
public class ArticuloController {

    private IArticuloService service;

    @PostMapping(ApiRoutes.ArticuloRoutes.add)
    public ResponseEntity<Articulo> add(@RequestBody ArticuloRequest request) throws RuntimeException {
        Articulo entidad = new Articulo();
        log.info("ArticuloController-add {}", request.toString());
        entidad = service.add(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(entidad);
    }

}
