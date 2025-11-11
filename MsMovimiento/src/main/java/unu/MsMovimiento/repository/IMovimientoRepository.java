package unu.MsMovimiento.repository;

import unu.MsMovimiento.model.Movimiento;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface IMovimientoRepository extends CrudRepository<Movimiento, Serializable> {
}
