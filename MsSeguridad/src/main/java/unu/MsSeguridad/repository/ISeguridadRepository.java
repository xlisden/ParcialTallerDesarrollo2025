package unu.MsSeguridad.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ISeguridadRepository extends MongoRepository<unu.MsSeguridad.model.Seguridad, String> {

    @Query("{ 'nombre': ?0, 'clave': ?1 }")
    boolean login(String nombre, String clave);
}
