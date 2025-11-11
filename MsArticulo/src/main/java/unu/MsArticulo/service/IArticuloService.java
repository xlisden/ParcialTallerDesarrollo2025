package unu.MsArticulo.service;

import unu.MsArticulo.controller.request.ArticuloRequest;
import unu.MsArticulo.model.Articulo;

import java.util.List;

public interface IArticuloService {

    public Articulo add(ArticuloRequest request);

}
