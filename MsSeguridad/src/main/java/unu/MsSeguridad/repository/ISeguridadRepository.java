package unu.MsSeguridad.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import unu.MsSeguridad.model.Seguridad;

import java.util.List;

@Repository
public interface ISeguridadRepository extends MongoRepository<Seguridad, String> {

    List<Seguridad> findByNombreAndClave(String nombre, String clave);
}
