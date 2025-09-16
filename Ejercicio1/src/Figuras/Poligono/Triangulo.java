package Figuras.Poligono;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class Triangulo extends Poligono{

    public Triangulo(){
        super(3); // un triángulo siempre tiene 3 lados
    }

}
