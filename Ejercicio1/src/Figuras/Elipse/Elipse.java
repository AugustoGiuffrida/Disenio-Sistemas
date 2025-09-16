package Figuras.Elipse;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@Getter
@Setter
public abstract class Elipse {
    protected int radio_mayor;
    protected int radio_menor;

    public Elipse(int radio_mayor, int radio_menor){
        this.radio_mayor = radio_mayor;
        this.radio_menor = radio_menor;
    }
}
