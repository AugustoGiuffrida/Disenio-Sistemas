package Persona;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor

@Getter
@Setter
public abstract class Persona {
    private String dni;
    private String nombre;
    private String direccion;
    private String profesion;
}
