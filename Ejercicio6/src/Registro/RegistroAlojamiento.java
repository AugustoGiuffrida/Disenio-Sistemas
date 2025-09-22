package Registro;

import Persona.Visitante;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class RegistroAlojamiento {
    private Visitante visitante;
    private String habitacion;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
}