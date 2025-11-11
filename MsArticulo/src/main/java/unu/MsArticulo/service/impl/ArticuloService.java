package unu.MsArticulo.service.impl;

import unu.MsArticulo.controller.request.ArticuloRequest;
import unu.MsArticulo.model.Articulo;
import unu.MsArticulo.model.dto.ArticuloDto;
import unu.MsArticulo.repository.IArticuloRepository;
import unu.MsArticulo.service.IArticuloService;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
@AllArgsConstructor
public class ArticuloService implements IArticuloService {

    private IArticuloRepository repository;

    @Override
    @Transactional
    public ArticuloDto add(ArticuloRequest request) {
        Articulo articulo = new Articulo();
        articulo.setNombre(request.getNombre());
        articulo.setPrecio(request.getPrecio());
        articulo = repository.save(articulo);
        return articulo.getDto();
    }
}
