public class Main {
    public static void main(String[] args) {
        // Crear continente
        Continente americaSur = new Continente("América del Sur");

        // Crear países
        Pais argentina = new Pais("Argentina");
        Pais chile = new Pais("Chile");
        Pais uruguay = new Pais("Uruguay");

        // Agregar países al continente
        americaSur.agregarPais(argentina);
        americaSur.agregarPais(chile);
        americaSur.agregarPais(uruguay);

        // Establecer países limítrofes
        argentina.agregarPaisesLimitrofes(chile);
        argentina.agregarPaisesLimitrofes(uruguay);

        // Crear provincias
        Provincia buenosAires = new Provincia("Buenos Aires");
        Provincia mendoza = new Provincia("Mendoza");
        Provincia cordoba = new Provincia("Córdoba");
        Provincia santiagoChile = new Provincia("Santiago de Chile");
        Provincia montevideo = new Provincia("Montevideo");

        argentina.agregarProvincia(buenosAires);
        argentina.agregarProvincia(mendoza);
        argentina.agregarProvincia(cordoba);
        chile.agregarProvincia(santiagoChile);
        uruguay.agregarProvincia(montevideo);

        // Crear ciudades
        Ciudad laPlata = new Ciudad("La Plata");
        Ciudad mzaCapital = new Ciudad("Ciudad de Mendoza");
        Ciudad cordobaCapital = new Ciudad("Ciudad de Córdoba");
        Ciudad santiagoCiudad = new Ciudad("Santiago");
        Ciudad montevideoCiudad = new Ciudad("Ciudad de Montevideo");

        // Asignar ciudades a provincias
        buenosAires.agregarCiudad(laPlata);
        mendoza.agregarCiudad(mzaCapital);
        cordoba.agregarCiudad(cordobaCapital);
        santiagoChile.agregarCiudad(santiagoCiudad);
        montevideo.agregarCiudad(montevideoCiudad);

        // Asignar capital de provincias
        buenosAires.setCiudadCapital(laPlata);
        mendoza.setCiudadCapital(mzaCapital);
        cordoba.setCiudadCapital(cordobaCapital);
        santiagoChile.setCiudadCapital(santiagoCiudad);
        montevideo.setCiudadCapital(montevideoCiudad);

        // Establecer provincias limítrofes
        mendoza.agregarProvinciaLimitrofe(cordoba);
        cordoba.agregarProvinciaLimitrofe(buenosAires);

        // Provincia que limita con otro país
        mendoza.agregarPaisLimitrofe(chile);

        // Establecer capital del país
        argentina.setCapital(buenosAires);
        chile.setCapital(santiagoChile);
        uruguay.setCapital(montevideo);

        // ================== PRINTS ==================
        System.out.println("=== Continente: " + americaSur.getNombre() + " ===");
        for (Pais p : americaSur.getPaises()) {
            System.out.println("País: " + p.getNombre());
            System.out.println(" - Capital: " + (p.getCapital() != null ? p.getCapital().getCiudadCapital().getNombre() : "No definida"));
            System.out.print(" - Países limítrofes: ");
            p.getPaisesLimitrofes().forEach(pl -> System.out.print(pl.getNombre() + " "));
            System.out.println();

            for (Provincia prov : p.getProvincias()) {
                System.out.println("   Provincia: " + prov.getNombre());
                System.out.println("    - Capital: " + (prov.getCiudadCapital() != null ? prov.getCiudadCapital().getNombre() : "No definida"));
                System.out.print("    - Provincias limítrofes: ");
                prov.getProvinciasLimitrofes().forEach(pl -> System.out.print(pl.getNombre() + " "));
                System.out.println();
                System.out.print("    - Países limítrofes: ");
                prov.getPaisesLimitrofes().forEach(pl -> System.out.print(pl.getNombre() + " "));
                System.out.println();
            }
            System.out.println();
        }
    }
}

