package Parque;

import Persona.Visitante;
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
    private String codigo;
    private LocalDate dia;
    private LocalTime hora;
    private List<Alojamiento> organizadores = new ArrayList<>();
    private List<Visitante> inscritos = new ArrayList<>();

    public Excursion(String codigo, LocalDate dia, LocalTime hora) {
        this.codigo = codigo;
        this.dia = dia;
        this.hora = hora;
    }

    public void inscribir(Visitante visitante) {
        if(!inscritos.contains(visitante)){
            inscritos.add(visitante);
        }
    }
}