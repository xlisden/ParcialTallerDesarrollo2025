package unu.MsSeguridad.service;

import unu.MsSeguridad.controller.request.SeguridadRequest;
import unu.MsSeguridad.model.Seguridad;

import java.util.List;

public interface ISeguridadService {

    public String login(SeguridadRequest request);

    public List<Seguridad> getAll();

}
