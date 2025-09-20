import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear restaurantes
        Restaurante r1 = new Restaurante("Pizzería Napoli");
        Restaurante r2 = new Restaurante("Parrilla Don José");

        // Agregar sucursales
        r1.agregarSucursal("Centro");
        r1.agregarSucursal("Barrio Norte");
        r2.agregarSucursal("San Martín");

        // Agregar platos
        r1.agregarPlatos("Pizza Napolitana");
        r1.agregarPlatos("Lasaña");
        r2.agregarPlatos("Asado");
        r2.agregarPlatos("Milanesa");

        // Crear personas
        Persona juan = new Persona("Juan");
        Persona maria = new Persona("María");

        // Relación Persona ↔ Restaurantes
        juan.agregarRestauranteFrecuente(r1);
        juan.agregarRestauranteFrecuente(r2);
        maria.agregarRestauranteFrecuente(r1);

        // Relación Persona ↔ Platos (del restaurante)
        juan.agregarPlatoFavorito(r1.getPlatos().get(0)); // Pizza Napolitana
        juan.agregarPlatoFavorito(r2.getPlatos().get(0)); // Asado
        maria.agregarPlatoFavorito(r1.getPlatos().get(1)); // Lasaña

        // ==== PRINTS ====
        System.out.println("=== Restaurantes ===");
        for(Restaurante r : List.of(r1, r2)){
            System.out.println("Restaurante: " + r.getNombre());
            System.out.print("  Sucursales: ");
            r.getSucursales().forEach(s -> System.out.print(s.getDireccion() + " "));
            System.out.println("\n  Platos: ");
            r.getPlatos().forEach(p -> System.out.println("   - " + p.getNombre()));
        }

        System.out.println("\n=== Personas ===");
        for(Persona p : List.of(juan, maria)){
            System.out.println("Persona: " + p.getNombre());
            System.out.print("  Frecuenta: ");
            p.getRestaurantesFrecuentes().forEach(r -> System.out.print(r.getNombre() + " "));
            System.out.print("\n  Le gustan: ");
            p.getPlatosFavoritos().forEach(pl -> System.out.print(pl.getNombre() + " "));
            System.out.println("\n");
        }
    }
}
