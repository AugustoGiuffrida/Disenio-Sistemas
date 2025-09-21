import Persona.Persona;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Excursion {
    private String codigo; // identificador único
    private LocalDate dia;
    private LocalTime hora;
    private List<Alojamiento> organizadores = new ArrayList<>();
    private List<Persona> inscritos = new ArrayList<>();

    public Excursion(String codigo, LocalDate dia, LocalTime hora) {
        this.codigo = codigo;
        this.dia = dia;
        this.hora = hora;
    }

    public void inscribir(Persona p) {
        if(!inscritos.contains(p)) inscritos.add(p);
    }
}