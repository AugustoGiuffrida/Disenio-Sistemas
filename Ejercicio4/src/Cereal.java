import enums.TipoCereal;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@Getter
@Setter
public class Cereal {
    private String nombre;
    private TipoCereal tipo; // GRUESO, FINO, PASTURA
    private Set<Mineral> mineralesRequeridos = new HashSet<>();

    public void agregarMineral(String nombre, String tipo){
        mineralesRequeridos.add(new Mineral(nombre,tipo));
    }
}
