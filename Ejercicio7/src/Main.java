import Prueba.Prueba;
import Prueba.Inscripcion;
import competidores.Equipo;
import competidores.Esquiador;
import enums.ModoParticipacion;
import federacion.Estacion;
import federacion.Federacion;
import pista.Pista;

import java.time.Duration;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // --- Crear federaciones ---
        Federacion fedArg = new Federacion("Federación Argentina de Esquí", 150);
        Federacion fedCh = new Federacion("Federación Chilena de Esquí", 100);

        // --- Crear estaciones ---
        Estacion estacionA = new Estacion("STA01", "Cerro Catedral", "info@cerrocatedral.com", "Bariloche", "0294-123456", 120, 10);
        Estacion estacionB = new Estacion("STB01", "Valle Nevado", "contacto@vnevado.cl", "Santiago", "022-654321", 80, 8);

        fedArg.agregarEstacion(estacionA);
        fedCh.agregarEstacion(estacionB);

        // --- Crear pistas ---
        Pista pista1 = new Pista(estacionA.getCodigo(), 1, 2.5, "verde");
        Pista pista2 = new Pista(estacionA.getCodigo(), 2, 3.0, "azul");
        Pista pista3 = new Pista(estacionB.getCodigo(), 1, 1.8, "roja");

        estacionA.agregarPista(pista1);
        estacionA.agregarPista(pista2);
        estacionB.agregarPista(pista3);

        // --- Crear esquiadores ---
        Esquiador e1 = new Esquiador("11111111", "Juan Perez", LocalDate.of(1990, 5, 10), 33, ModoParticipacion.INDIVIDUAL, fedArg);
        Esquiador e2 = new Esquiador("22222222", "Maria Gomez", LocalDate.of(1995, 8, 22), 28, ModoParticipacion.INDIVIDUAL, fedArg);
        Esquiador e3 = new Esquiador("33333333", "Carlos Diaz", LocalDate.of(1992, 3, 15), 31, ModoParticipacion.EQUIPO, fedCh);
        Esquiador e4 = new Esquiador("44444444", "Ana Lopez", LocalDate.of(1994, 12, 5), 29, ModoParticipacion.EQUIPO, fedCh);

        // --- Crear equipo ---
        Equipo equipo1 = new Equipo("EQ01", "Entrenador Chile");
        equipo1.agregarMiembro(e3);
        equipo1.agregarMiembro(e4);

        // --- Crear prueba ---
        Prueba slalom = new Prueba();
        slalom.setNombre("Slalom Cerro Catedral");
        slalom.setTipo("slalom");
        slalom.setEstacion(estacionA);
        slalom.getFechas().add(LocalDate.of(2025, 9, 25));
        slalom.getFechas().add(LocalDate.of(2025, 9, 26));

        // Agregar pistas a la prueba
        slalom.agregarPista(pista1);
        slalom.agregarPista(pista2);

        // --- Inscribir competidores ---
        Inscripcion ins1 = slalom.inscribirCompetidor(e1, 101);
        Inscripcion ins2 = slalom.inscribirCompetidor(e2, 102);

        // --- Registrar resultados ---
        slalom.registrarResultado(ins1, LocalDate.of(2025, 9, 25), Duration.ofMinutes(5), 2);
        slalom.registrarResultado(ins2, LocalDate.of(2025, 9, 25), Duration.ofMinutes(4).plusSeconds(30), 1);

        // --- Mostrar resultados ---
        System.out.println("Vencedor: " + slalom.getVencedor().getParticipante().toString());
        for(Inscripcion i : slalom.getInscripciones()){
            System.out.println(i.getCodigo() + " -> Resultados: " + i.getResultados().size());
        }

        // --- Crear prueba por equipos ---
        Prueba fondoEquipo = new Prueba();
        fondoEquipo.setNombre("Fondo Valle Nevado");
        fondoEquipo.setTipo("fondo");
        fondoEquipo.setEstacion(estacionB);
        fondoEquipo.getFechas().add(LocalDate.of(2025, 10, 5));

        fondoEquipo.agregarPista(pista3);

        // Inscribir equipo
        Inscripcion insEq = fondoEquipo.inscribirCompetidor(equipo1, 201);

        // Registrar resultado del equipo
        fondoEquipo.registrarResultado(insEq, LocalDate.of(2025, 10, 5), Duration.ofMinutes(12), 1);

        System.out.println("Vencedor prueba por equipos: " + fondoEquipo.getVencedor().getParticipante().toString());
    }
}
