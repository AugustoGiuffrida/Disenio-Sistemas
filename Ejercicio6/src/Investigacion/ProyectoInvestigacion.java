package Investigacion;

import Especie.Especie;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

@NoArgsConstructor
@Getter
@Setter
public class ProyectoInvestigacion {
    private String nombre;
    private double presupuesto;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Map<Especie, String> especiesInvestigadas = new HashMap<>();

    public ProyectoInvestigacion(String nombre, double presupuesto, LocalDate fechaInicio, LocalDate fechaFin) {
        this.nombre = nombre;
        this.presupuesto = presupuesto;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.especiesInvestigadas = new HashMap<>();
    }

    public void agregarEspecie(Especie e, String nota){
        especiesInvestigadas.put(e, nota);
    }
}