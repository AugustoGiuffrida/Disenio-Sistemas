package Prueba;

import competidores.Competidor;
import competidores.Equipo;
import competidores.Esquiador;
import enums.ModoParticipacion;
import federacion.Estacion;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pista.Pista;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Prueba {
    private String nombre;
    private String tipo;
    private Estacion estacion;
    private List<Pista> pistas = new ArrayList<>();
    private List<LocalDate> fechas = new ArrayList<>();
    private List<Inscripcion> inscripciones = new ArrayList<>();
    private Inscripcion vencedor;
    private Duration tiempoVencedor;

    public void agregarPista(Pista p){
        validarPista(p);
        pistas.add(p);
    }

    private void validarPista(Pista p){
        if(p == null) throw new IllegalArgumentException("Pista nula.");
        if(!p.getEstacionCodigo().equals(estacion.getCodigo()))
            throw new IllegalArgumentException("Todas las pistas deben pertenecer a la misma estación de la prueba.");
    }

    public Inscripcion inscribirCompetidor(Competidor c, int dorsal){
        validarCompetidor(c);
        validarDorsal(dorsal);
        Inscripcion ins = new Inscripcion(this, c, dorsal);
        inscripciones.add(ins);
        return ins;
    }

    private void validarCompetidor(Competidor c){
        if(c instanceof Esquiador e){
            e.validarFederacion();
            if(e.getModo() != ModoParticipacion.INDIVIDUAL)
                throw new IllegalArgumentException("Esquiador no puede inscribirse individualmente.");
        } else if(!(c instanceof Equipo)){
            throw new IllegalArgumentException("Competidor inválido.");
        }
    }

    private void validarDorsal(int dorsal){
        boolean usado = inscripciones.stream().anyMatch(i -> i.getDorsal() == dorsal);
        if(usado) throw new IllegalArgumentException("Dorsal ya utilizado.");
    }

    public void registrarResultado(Inscripcion ins, LocalDate fecha, Duration tiempo, int posicion){
        if(!inscripciones.contains(ins)) throw new IllegalArgumentException("Inscripción no pertenece a esta prueba.");
        if(!fechas.contains(fecha)) throw new IllegalArgumentException("Fecha no prevista en la prueba.");

        ins.agregarResultado(new Resultado(fecha, tiempo, posicion));
        actualizarVencedor(ins, tiempo);
    }

    private void actualizarVencedor(Inscripcion ins, Duration tiempo){
        if(vencedor == null || tiempo.compareTo(tiempoVencedor) < 0){
            vencedor = ins;
            tiempoVencedor = tiempo;
        }
    }
}
