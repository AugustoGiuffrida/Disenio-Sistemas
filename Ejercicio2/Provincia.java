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
    private Ciudad ciudadCapital;
    private List<Provincia> provinciasLimitrofes = new ArrayList<>();
    private List<Pais> paisesLimitrofes = new ArrayList<>();
    private List<Ciudad> ciudades = new ArrayList<>();

    public Provincia(String nombre){
        this.nombre = nombre;
    }

    public void agregarProvinciaLimitrofe(Provincia provincia){
        if(!provinciasLimitrofes.contains(provincia)){
            provinciasLimitrofes.add(provincia);
            provincia.agregarProvinciaLimitrofe(this);
        }
    }

    public void agregarPaisLimitrofe(Pais pais){
        if(!paisesLimitrofes.contains(pais)){
            paisesLimitrofes.add(pais);
        }
    }

    public void agregarCiudad(Ciudad ciudad){
        ciudades.add(ciudad);
    }

    public void eliminarCiudad(Ciudad ciudad){
        ciudades.remove(ciudad);
    }
}
