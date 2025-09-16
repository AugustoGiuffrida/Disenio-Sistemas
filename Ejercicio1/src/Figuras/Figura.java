package Figuras;

import Figuras.Elipse.Elipse;
import Figuras.Poligono.Poligono;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public abstract class Figura {
    private String nombre;
    private List<Elipse> elipses;
    private List<Poligono> poligonos;

    public Figura(String nombre){
        this.nombre = nombre;
        this.elipses = new ArrayList<>();
        this.poligonos = new ArrayList<>();
    }

    public void agregarElipse(Elipse elipse){
        elipses.add(elipse);
    }

    public void agregarPoligono(Poligono poligono){
        poligonos.add(poligono);
    }

    public void eliminarElipse(Elipse elipse){
        elipses.remove(elipse);
    }

    public void eliminarPoligono(Poligono poligono){
        poligonos.remove(poligono);
    }
}
