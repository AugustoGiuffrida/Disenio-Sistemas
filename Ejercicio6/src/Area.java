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
public class Area {
    private String nombre;
    private double km2;
    private List<PresenciaEspecie> presencias = new ArrayList<>();

    public Area(String nombre, double km2) {
        this.nombre = nombre;
        this.km2 = km2;
    }

    public void agregarPresencia(PresenciaEspecie p) {
        presencias.add(p);
    }
}
