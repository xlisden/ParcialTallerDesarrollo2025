package unu.MsArticulo.controller;

import unu.MsArticulo.controller.request.ArticuloRequest;
import unu.MsArticulo.model.dto.ArticuloDto;
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
    public ResponseEntity<ArticuloDto> add(@RequestBody ArticuloRequest request) throws RuntimeException {
        ArticuloDto dto = new ArticuloDto();
        log.info("ArticuloController-add {}", request.toString());
        dto = service.add(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(dto);
    }

}
