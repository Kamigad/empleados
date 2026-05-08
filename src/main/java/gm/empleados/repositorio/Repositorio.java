package gm.empleados.repositorio;

import gm.empleados.modelo.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repositorio extends JpaRepository<Empleado,Integer> {
}
