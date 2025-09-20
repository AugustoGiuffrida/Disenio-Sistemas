import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class Persona {
    private String nombre;
    private List<Restaurante> restaurantesFrecuentes = new ArrayList<>();
    private List<Plato> platosFavoritos = new ArrayList<>();

    public Persona(String nombre){
        this.nombre = nombre;
    }

    public void agregarRestauranteFrecuente(Restaurante restaurante){
        if(!restaurantesFrecuentes.contains(restaurante)){
            restaurantesFrecuentes.add(restaurante);
        }
    }

    public void agregarPlatoFavorito(Plato plato){
        if(!platosFavoritos.contains(plato)){
            platosFavoritos.add(plato);
        }
    }
}

