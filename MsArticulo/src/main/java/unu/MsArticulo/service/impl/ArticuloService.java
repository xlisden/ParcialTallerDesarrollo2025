package unu.MsArticulo.service.impl;

import unu.MsArticulo.controller.request.ArticuloRequest;
import unu.MsArticulo.model.Articulo;
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
    public Articulo add(ArticuloRequest request) {
        Articulo entidad = new Articulo();
        entidad.setNombre(request.getNombre());
        entidad.setPrecio(request.getPrecio());
        return repository.save(entidad);
    }
}
