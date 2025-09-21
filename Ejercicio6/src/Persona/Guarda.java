package Persona;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Guarda extends Persona {
    private Area areaAsignada;
    private Vehiculo vehiculo;
}