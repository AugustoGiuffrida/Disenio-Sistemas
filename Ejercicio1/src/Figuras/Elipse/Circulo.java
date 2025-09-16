package Figuras.Elipse;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Circulo extends Elipse {

    public Circulo(int radio) {
        super(radio, radio); // en un círculo los dos radios son iguales
    }

    public int getRadio() {
        return getRadio_mayor(); // o radioMenor, ambos son iguales
    }
}

