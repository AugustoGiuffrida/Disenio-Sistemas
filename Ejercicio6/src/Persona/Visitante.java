package Persona;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Visitante extends Persona {
    private String email;

    public Visitante(String dni, String nombre, String direccion, String telefono, String email) {
        super(dni, nombre, direccion, telefono);
        this.email = email;
    }
}
