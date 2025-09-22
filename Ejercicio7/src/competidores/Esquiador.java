package competidores;

import federacion.Federacion;
import enums.ModoParticipacion;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Esquiador implements Competidor {
    private String dni;
    private String nombre;
    private LocalDate fechaNacimiento;
    private int edad;
    private ModoParticipacion modo;
    private Federacion federacion;

    public void validarFederacion() {
        if (federacion == null) throw new IllegalArgumentException("Esquiador debe pertenecer a una federación.");
    }
}
