package Persona;

import Investigacion.ProyectoInvestigacion;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Investigador extends Persona {
    private String titulacion;
    private List<ProyectoInvestigacion> proyectos = new ArrayList<>();

    public Investigador(String dni, String nombre, String direccion, String telefono, String titulacion) {
        super(dni, nombre, direccion, telefono);
        this.titulacion = titulacion;
    }

    public void agregarProyecto(ProyectoInvestigacion p) {
        if(!proyectos.contains(p)){
            proyectos.add(p);
        }
    }
}
