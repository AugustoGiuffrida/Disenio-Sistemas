package federacion;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class Federacion {
    private String nombre;
    private int nroFederados;
    private List<Estacion> estacionesAdministradas = new ArrayList<>();

    public Federacion(String nombre, int nroFederados){
        this.nombre = nombre;
        this.nroFederados = nroFederados;
        this.estacionesAdministradas = new ArrayList<>();
    }

    public void agregarEstacion(Estacion e){
        if(!estacionesAdministradas.contains(e)) estacionesAdministradas.add(e);
    }
}
