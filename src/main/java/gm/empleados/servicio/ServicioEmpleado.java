package gm.empleados.servicio;

import gm.empleados.modelo.Empleado;
import gm.empleados.repositorio.Repositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioEmpleado implements IServicioEmpleado {

    @Autowired
    private Repositorio respositorioEmpleado;

    @Override
    public List<Empleado> listarEmpleados() {
        return respositorioEmpleado.findAll();
    }

    @Override
    public Empleado buscarEmpleadoId(Integer idEmpleado) {
        Empleado empleado = respositorioEmpleado.findById(idEmpleado).orElse(null);
        return empleado;
    }

    @Override
    public void agregarEmpleado(Empleado empleado) {
        respositorioEmpleado.save(empleado);
    }

    @Override
    public void eliminarEmpleado(Empleado empleado) {
        respositorioEmpleado.delete(empleado);
    }
}
