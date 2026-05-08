package gm.empleados.servicio;

import gm.empleados.modelo.Empleado;

import java.util.List;

public interface IServicioEmpleado {

    public List<Empleado> listarEmpleados();
    public Empleado buscarEmpleadoId(Integer idEmpleado);
    public void agregarEmpleado(Empleado empleado);
    public void eliminarEmpleado(Empleado empleado);
}
