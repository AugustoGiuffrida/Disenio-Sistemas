package Figuras.Poligono.Cuadrilatero;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Rectangulo extends Cuadrilatero{
    protected double base;
    protected double altura;

    public Rectangulo(double base, double altura){
        super(); // asegura nroLados = 4
        this.base = base;
        this.altura = altura;
    }

}
