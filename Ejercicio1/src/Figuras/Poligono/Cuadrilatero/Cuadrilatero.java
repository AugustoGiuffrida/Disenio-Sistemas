package Figuras.Poligono.Cuadrilatero;

import Figuras.Poligono.Poligono;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Cuadrilatero extends Poligono {

    public Cuadrilatero() {
        super(4); // un cuadrilátero siempre tiene 4 lados
    }
}
