package Figuras.Poligono;

import Figuras.Lado.Lado;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public abstract class Poligono {
    protected int nroLados;
    protected List<Lado> lados = new ArrayList<>();

    public Poligono(int nroLados){
        this.nroLados = nroLados;
    }

    // Metodo para agregar un lado
    public void agregarLado(Lado lado) {
        if (lados.size() < nroLados) {
            lados.add(lado);
        } else {
            System.out.println("Un polígono con:" + nroLados + " lados no puede tener más lados.");
        }
    }

    public List<Lado> getLados() {
        return Collections.unmodifiableList(lados);
    }
}
