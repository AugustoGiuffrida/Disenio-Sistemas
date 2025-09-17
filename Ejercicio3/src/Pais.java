import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class Pais {
    private String nombre;
    private List<Provincia> provincias = new ArrayList<>();

    public Pais(String nombre){
        this.nombre = nombre;
    }

    public void agregarProvincia(Provincia provincia){
        provincias.add(provincia);
    }

    public void eliminarProvincia(Provincia provincia){
        provincias.remove(provincia);
    }
}
