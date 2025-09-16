package Figuras.Lado;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@Getter
@Setter
public class Lado { //solo 2 puntos definen un lado
    private Punto inicio;
    private Punto fin;

    public Lado(Punto inicio, Punto fin) {
        this.inicio = inicio;
        this.fin = fin;
    }
}
