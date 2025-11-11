package unu.MsArticulo.repository;

import unu.MsArticulo.model.Articulo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface IArticuloRepository extends CrudRepository<Articulo, Serializable> {
}
