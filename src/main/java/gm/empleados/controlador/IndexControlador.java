package gm.empleados.controlador;

import gm.empleados.modelo.Empleado;
import gm.empleados.servicio.ServicioEmpleado;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class IndexControlador {
    private static final Logger logger = LoggerFactory.getLogger(IndexControlador.class);

    @Autowired
    ServicioEmpleado servicioEmpleado;

    @RequestMapping(value = "/", method = RequestMethod.GET)
     public String iniciar(ModelMap modelo){
         List<Empleado> empleados = servicioEmpleado.listarEmpleados();
         empleados.forEach(empleado -> logger.info(empleado.toString()));
         //COmpartimos el modelo con la vista
         modelo.put("empleados", empleados);
         return "index"; //index.jsp
     }

     @RequestMapping(value = "/agregar",method = RequestMethod.GET)
    public String mostrarAgregar(){
        return "agregar";//agregar.jsp
     }

     @RequestMapping(value = "/agregar", method = RequestMethod.POST)
    public String agregar(@ModelAttribute("empleadoForma") Empleado empleado){
         logger.info("Empleado agregado " + empleado);
        servicioEmpleado.agregarEmpleado(empleado);
        return "redirect:/";
     }
}
