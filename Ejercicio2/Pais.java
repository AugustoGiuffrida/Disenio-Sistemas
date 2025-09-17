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
    private Provincia capital;
    private List<Pais> paisesLimitrofes = new ArrayList<>();
    private List<Provincia> provincias = new ArrayList<>();

    public Pais(String nombre){
        this.nombre = nombre;
    }

    public void agregarPaisesLimitrofes(Pais pais) {
        if (!paisesLimitrofes.contains(pais)) {
            paisesLimitrofes.add(pais);
            pais.agregarPaisesLimitrofes(this);
        }
    }

    public void agregarProvincia(Provincia provincia){
        provincias.add(provincia);
    }

    public void eliminarProvincia(Provincia provincia){
        provincias.remove(provincia);
    }
}
