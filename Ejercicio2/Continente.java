import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class Continente {
    private String nombre;
    private List<Pais> paises = new ArrayList<>();

    public Continente(String nombre){
        this.nombre = nombre;
    }

    public void agregarPais(Pais pais){
        paises.add(pais);
    }

    public void eliminarPais(Pais pais){
        paises.remove(pais);
    }
}
