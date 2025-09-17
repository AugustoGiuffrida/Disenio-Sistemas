import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class Provincia {
    private String nombre;
    private List<Ciudad> ciudades = new ArrayList<>();

    public Provincia(String nombre){
        this.nombre = nombre;
    }

    public void agregarCiudad(Ciudad ciudad){
        ciudades.add(ciudad);
    }

    public void eliminarCiudad(Ciudad ciudad){
        ciudades.remove(ciudad);
    }

    public boolean tieneDeficitGeneral(){
        long totalCiudades = ciudades.size();
        long ciudadesEnDeficit = ciudades.stream().filter(Ciudad::tieneDeficit).count();
        return (totalCiudades/2) < ciudadesEnDeficit;
    }
}
