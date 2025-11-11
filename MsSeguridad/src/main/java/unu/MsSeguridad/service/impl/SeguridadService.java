package unu.MsSeguridad.service.impl;

import unu.MsSeguridad.controller.request.SeguridadRequest;
import unu.MsSeguridad.model.Seguridad;
import unu.MsSeguridad.repository.ISeguridadRepository;
import unu.MsSeguridad.service.ISeguridadService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import unu.MsSeguridad.utils.Mensajes;
import unu.MsSeguridad.utils.exceptions.UnauthorizedException;

import java.util.List;

@Log4j2
@Service
@AllArgsConstructor
public class SeguridadService implements ISeguridadService {

    private ISeguridadRepository repository;

    @Override
    public String login(SeguridadRequest request) {
        List<Seguridad> items = repository.findByNombreAndClave(request.getNombre(), request.getClave());
        if (items.size() <= 0) {
            throw new UnauthorizedException("Credenciales incorrectas.");
        }
        return Mensajes.loginSuccess;
    }

    @Override
    public List<Seguridad> getAll() {
        return repository.findAll();
    }
}
