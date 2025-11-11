package unu.MsSeguridad.service.impl;

import unu.MsSeguridad.controller.request.SeguridadRequest;
import unu.MsSeguridad.repository.ISeguridadRepository;
import unu.MsSeguridad.service.ISeguridadService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import unu.MsSeguridad.utils.Mensajes;
import unu.MsSeguridad.utils.exceptions.UnauthorizedException;

@Log4j2
@Service
@AllArgsConstructor
public class SeguridadService implements ISeguridadService {

    private ISeguridadRepository repository;

    @Override
    public String login(SeguridadRequest request) {
        boolean isCredencialesCorrectas = repository.login(request.getNombre(), request.getClave());
        if (!isCredencialesCorrectas) {
            throw new UnauthorizedException("Credenciales incorrectas.");
        }
        return Mensajes.loginSuccess;
    }

}
