package Parque;

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
public class Parque {
    private String nombre;
    private LocalDate fechaDeclaracion;
    private List<Area> areas = new ArrayList<>();
    private List<Alojamiento> alojamientos = new ArrayList<>();
    private List<Entrada> entradas = new ArrayList<>();

    public Parque(String nombre, LocalDate fechaDeclaracion) {
        this.nombre = nombre;
        this.fechaDeclaracion = fechaDeclaracion;
    }

    public void agregarArea(Area a) { areas.add(a); }
    public void agregarAlojamiento(Alojamiento a) { alojamientos.add(a); }
    public void agregarEntrada(Entrada e) { entradas.add(e); }
}
