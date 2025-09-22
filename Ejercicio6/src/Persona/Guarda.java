package Persona;

import Parque.Area;
import Parque.Vehiculo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Guarda extends Persona {
    private Area areaAsignada;
    private Vehiculo vehiculo;

    public Guarda(String dni, String nombre, String direccion, String telefono, Area areaAsignada, Vehiculo vehiculo) {
        super(dni, nombre, direccion, telefono);
        this.areaAsignada = areaAsignada;
        this.vehiculo = vehiculo;
    }
}