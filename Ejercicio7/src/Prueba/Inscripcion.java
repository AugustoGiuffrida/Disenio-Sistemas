package Prueba;

import competidores.Competidor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class Inscripcion {
    private Prueba prueba;
    private Competidor participante;
    private int dorsal;
    private String codigo;
    private List<Resultado> resultados = new ArrayList<>();

    public Inscripcion(Prueba prueba, Competidor participante, int dorsal){
        this.prueba = prueba;
        this.participante = participante;
        this.dorsal = dorsal;
        this.codigo = prueba.getNombre() + "-" + dorsal;
    }

    public void agregarResultado(Resultado resultado){
        resultados.add(resultado);
    }
}