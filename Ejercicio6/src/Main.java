import Especie.Animal;
import Especie.PresenciaEspecie;
import Especie.Vegetal;
import Investigacion.ProyectoInvestigacion;
import Parque.ComunidadAutonoma;
import Parque.Parque;
import Parque.Area;
import Parque.Alojamiento;
import Parque.Vehiculo;
import Persona.Celador;
import Persona.Guarda;
import Persona.Investigador;
import Persona.Visitante;
import Parque.Excursion;
import Registro.RegistroAlojamiento;
import enums.CategoriaAlojamiento;
import enums.Dieta;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        // ===================== COMUNIDADES AUTONOMAS =====================
        ComunidadAutonoma catalunya = new ComunidadAutonoma("Cataluña", "Departament de Medi Ambient");
        ComunidadAutonoma madrid = new ComunidadAutonoma("Madrid", "Consejería de Medio Ambiente");

        // ===================== PARQUES =====================
        Parque montseny = new Parque("Parque Natural del Montseny", LocalDate.of(1978, 1, 1));
        Parque sierraGuadarrama = new Parque("Parque Nacional Sierra de Guadarrama", LocalDate.of(2013, 6, 25));

        // Agregar parques a CAs
        catalunya.agregarParque(montseny);
        madrid.agregarParque(sierraGuadarrama);
        madrid.agregarParque(montseny); // Parque que se extiende por varias CAs

        // ===================== AREAS =====================
        Area bosqueAltaMontanya = new Area("Bosque de Alta Montaña", 50.0);
        Area valleRiera = new Area("Valle de la Riera", 30.0);
        Area sierraNorte = new Area("Sierra Norte", 70.0);

        montseny.agregarArea(bosqueAltaMontanya);
        montseny.agregarArea(valleRiera);
        sierraGuadarrama.agregarArea(sierraNorte);

        // ===================== ESPECIES =====================
        Vegetal pinoSilvestre = new Vegetal("Pinus sylvestris", "Pino Silvestre", true, "Mayo-Junio");
        Vegetal abeto = new Vegetal("Abies alba", "Abeto", true, "Junio-Julio");
        Animal linceIbérico = new Animal("Lynx pardinus", "Lince Ibérico", Dieta.CARNIVORO, "Febrero-Marzo");
        Animal ciervo = new Animal("Cervus elaphus", "Ciervo", Dieta.HERBIVORO, "Septiembre-Octubre");

        // Asignar presencias en áreas
        bosqueAltaMontanya.agregarPresencia(new PresenciaEspecie(pinoSilvestre, 150));
        bosqueAltaMontanya.agregarPresencia(new PresenciaEspecie(linceIbérico, 3));
        valleRiera.agregarPresencia(new PresenciaEspecie(abeto, 50));
        sierraNorte.agregarPresencia(new PresenciaEspecie(ciervo, 25));

        // Alimentación animales
        linceIbérico.getCome().add(ciervo); // Lince come ciervo

        // ===================== ALOJAMIENTOS =====================
        Alojamiento refugioMontseny = new Alojamiento("Refugio Montseny", 20, CategoriaAlojamiento.TURISTICO);
        Alojamiento refugioGuadarrama = new Alojamiento("Refugio Guadarrama", 30, CategoriaAlojamiento.CABANA);

        montseny.agregarAlojamiento(refugioMontseny);
        sierraGuadarrama.agregarAlojamiento(refugioGuadarrama);

        // ===================== VISITANTES =====================
        Visitante juan = new Visitante("12345678A", "Juan Pérez", "C/ Falsa 123", "juan@mail.com", "600123456");
        Visitante maria = new Visitante("87654321B", "María López", "Av. Real 45", "maria@mail.com", "600654321");

        // ===================== REGISTRO ALOJAMIENTO =====================
        refugioMontseny.registrarEstadia(new RegistroAlojamiento(juan, "101", LocalDate.of(2025, 6, 1), LocalDate.of(2025, 6, 5)));
        refugioGuadarrama.registrarEstadia(new RegistroAlojamiento(maria, "201", LocalDate.of(2025, 7, 10), LocalDate.of(2025, 7, 15)));

        // ===================== EXCURSIONES =====================
        Excursion senderismoMontseny = new Excursion("EX001", LocalDate.of(2025, 6, 2), LocalTime.of(9, 0));
        senderismoMontseny.getOrganizadores().add(refugioMontseny);
        senderismoMontseny.inscribir(juan);

        Excursion rutaGuadarrama = new Excursion("EX002", LocalDate.of(2025, 7, 11), LocalTime.of(10, 30));
        rutaGuadarrama.getOrganizadores().add(refugioGuadarrama);
        rutaGuadarrama.inscribir(maria);

        // ===================== PERSONAL =====================
        Celador celador1 = new Celador("11111111X", "Carlos Gómez", "C/ Central 5", "Celador", montseny.getEntradas().isEmpty() ? null : montseny.getEntradas().get(0));
        Guarda guarda1 = new Guarda("22222222Y", "Ana Ruiz", "C/ Montaña 7", "Guarda", bosqueAltaMontanya, new Vehiculo("Todoterreno", "1234-ABC"));
        Investigador investigador1 = new Investigador("33333333Z", "Laura Martín", "C/ Investigador 9", "Investigadora", "Biología");

        ProyectoInvestigacion proyecto1 = new ProyectoInvestigacion("Estudio Flora Montseny", 5000, LocalDate.of(2024,1,1), LocalDate.of(2024,12,31));
        proyecto1.agregarEspecie(pinoSilvestre, "Observación de crecimiento");
        investigador1.agregarProyecto(proyecto1);

        // ===================== PRINTS =====================
        System.out.println("=== Comunidades Autónomas y Parques ===");
        for(ComunidadAutonoma ca : new ComunidadAutonoma[]{catalunya, madrid}) {
            System.out.println("CA: " + ca.getNombre() + " - Organismo: " + ca.getOrganismoResponsable());
            for(Parque p : ca.getParques()) {
                System.out.println("  Parque: " + p.getNombre() + " - Declarado: " + p.getFechaDeclaracion());
                System.out.println("    Areas:");
                for(Area a : p.getAreas()) {
                    System.out.print("      " + a.getNombre() + " (" + a.getKm2() + " km2) - Especies: ");
                    for(PresenciaEspecie pe : a.getPresencias()) {
                        System.out.print(pe.getEspecie().getNombreVulgar() + " (" + pe.getNumeroIndividuos() + "), ");
                    }
                    System.out.println();
                }
            }
        }

        System.out.println("\n=== Visitantes y Excursiones ===");
        for(Excursion e : new Excursion[]{senderismoMontseny, rutaGuadarrama}) {
            System.out.println("Excursión: " + e.getCodigo() + " - Día: " + e.getDia() + " Hora: " + e.getHora());
            System.out.print("  Inscritos: ");
            for(Visitante v : e.getInscritos()) {
                System.out.print(v.getNombre() + " ");
            }
            System.out.println();
        }

        System.out.println("\n=== Personal de Parques ===");
        System.out.println("Celador: " + celador1.getNombre());
        System.out.println("Guarda: " + guarda1.getNombre() + " - Area: " + guarda1.getAreaAsignada().getNombre() + " - Vehículo: " + guarda1.getVehiculo().getTipo());
        System.out.println("Investigador: " + investigador1.getNombre() + " - Proyecto: " + investigador1.getProyectos().get(0).getNombre());
    }
}
