import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class Ciudad {
    private String nombre;
    private List<Restaurante> restaurantes = new ArrayList<>();

    public Ciudad(String nombre){
        this.nombre = nombre;
    }

    public void agregarRestaurante(String nombre){
        restaurantes.add(new Restaurante(nombre));
    }
}
