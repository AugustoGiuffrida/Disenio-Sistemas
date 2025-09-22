package pista;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Pista {
    private String estacionCodigo;
    private int numero;
    private double longitudKm;
    private String nivelDificultad;
}
