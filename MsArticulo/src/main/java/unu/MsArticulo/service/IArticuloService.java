package unu.MsArticulo.service;

import unu.MsArticulo.controller.request.ArticuloRequest;
import unu.MsArticulo.model.dto.ArticuloDto;

import java.util.List;

public interface IArticuloService {

    public ArticuloDto add(ArticuloRequest request);

}
