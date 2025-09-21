import enums.CategoriaAlojamiento;
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
public class Alojamiento {
    private String nombre;
    private int capacidad;
    private CategoriaAlojamiento categoria;
    private List<RegistroAlojamiento> registros = new ArrayList<>();
    private List<Excursion> excursionesOrganizadas = new ArrayList<>();

    public void registrarEstadia(RegistroAlojamiento r){
        registros.add(r);
    }

    public void agregarExcursion(Excursion e){
        excursionesOrganizadas.add(e);
    }
}
