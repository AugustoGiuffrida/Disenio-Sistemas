import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ComunidadAutonoma {
    private String nombre;
    private String organismoResponsable;
    private List<Parque> parques = new ArrayList<>();

    public ComunidadAutonoma(String nombre, String organismoResponsable) {
        this.nombre = nombre;
        this.organismoResponsable = organismoResponsable;
    }

    public void agregarParque(Parque p) {
        if (!parques.contains(p)) {
            parques.add(p);
        }
    }
}