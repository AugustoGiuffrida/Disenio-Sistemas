package Persona;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Celador extends Persona{
    private Entrada entradaAsignada;
    private List<RegistroVisita> registros = new ArrayList<>();

    public void registrarVisita(Persona visitante, LocalDate fecha){
        registros.add(new RegistroVisita(visitante, fecha));
    }
}