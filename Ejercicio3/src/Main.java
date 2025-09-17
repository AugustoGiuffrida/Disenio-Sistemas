public class Main {
    public static void main(String[] args) {
        // === Crear País ===
        Pais argentina = new Pais("Argentina");

        // === Crear Provincias ===
        Provincia buenosAires = new Provincia("Buenos Aires");
        Provincia cordoba = new Provincia("Córdoba");

        argentina.agregarProvincia(buenosAires);
        argentina.agregarProvincia(cordoba);

        // === Crear Ciudades ===
        Ciudad laPlata = new Ciudad();
        laPlata.setNombre("La Plata");
        laPlata.setGastosMantenimiento(500_000);
        laPlata.getImpuestos().put("imp1", 200_000.0);
        laPlata.getImpuestos().put("imp2", 100_000.0);
        laPlata.getImpuestos().put("imp3", 80_000.0);
        laPlata.getImpuestos().put("imp4", 50_000.0);
        laPlata.getImpuestos().put("imp5", 40_000.0);

        Ciudad marDelPlata = new Ciudad();
        marDelPlata.setNombre("Mar del Plata");
        marDelPlata.setGastosMantenimiento(250_000);
        marDelPlata.getImpuestos().put("imp1", 100_000.0);
        marDelPlata.getImpuestos().put("imp2", 70_000.0);
        marDelPlata.getImpuestos().put("imp3", 60_000.0);
        marDelPlata.getImpuestos().put("imp4", 40_000.0);
        marDelPlata.getImpuestos().put("imp5", 30_000.0);

        Ciudad cordobaCapital = new Ciudad();
        cordobaCapital.setNombre("Córdoba Capital");
        cordobaCapital.setGastosMantenimiento(600_000);
        cordobaCapital.getImpuestos().put("imp1", 300_000.0);
        cordobaCapital.getImpuestos().put("imp2", 200_000.0);
        cordobaCapital.getImpuestos().put("imp3", 150_000.0);
        cordobaCapital.getImpuestos().put("imp4", 100_000.0);
        cordobaCapital.getImpuestos().put("imp5", 50_000.0);

        Ciudad villaCarlosPaz = new Ciudad();
        villaCarlosPaz.setNombre("Villa Carlos Paz");
        villaCarlosPaz.setGastosMantenimiento(200_000);
        villaCarlosPaz.getImpuestos().put("imp1", 80_000.0);
        villaCarlosPaz.getImpuestos().put("imp2", 60_000.0);
        villaCarlosPaz.getImpuestos().put("imp3", 40_000.0);
        villaCarlosPaz.getImpuestos().put("imp4", 30_000.0);
        villaCarlosPaz.getImpuestos().put("imp5", 20_000.0);

        // === Agregar Ciudades a Provincias ===
        buenosAires.agregarCiudad(laPlata);
        buenosAires.agregarCiudad(marDelPlata);
        cordoba.agregarCiudad(cordobaCapital);
        cordoba.agregarCiudad(villaCarlosPaz);

        // === PRINTS ===
        System.out.println("=== País: " + argentina.getNombre() + " ===");
        for (Provincia prov : argentina.getProvincias()) {
            System.out.println("Provincia: " + prov.getNombre());

            for (Ciudad ciudad : prov.getCiudades()) {
                System.out.println(" - Ciudad: " + ciudad.getNombre());
                System.out.println("   Recaudación total: " + ciudad.getRecaudacionTotal());
                System.out.println("   Gastos: " + ciudad.getGastosMantenimiento());
                System.out.println("   ¿En déficit?: " + (ciudad.tieneDeficit() ? "Sí" : "No"));
            }

            System.out.println(">> ¿Provincia en déficit general?: "
                    + (prov.tieneDeficitGeneral() ? "Sí" : "No"));
            System.out.println();
        }
    }
}
