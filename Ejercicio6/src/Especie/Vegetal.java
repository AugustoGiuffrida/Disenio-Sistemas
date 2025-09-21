package Especie;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Vegetal extends Especie {
    private boolean tieneFloracion;
    private String periodoFloracion;
}
