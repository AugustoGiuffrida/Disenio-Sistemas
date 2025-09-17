import enums.TipoCereal;

public class Main {
    public static void main(String[] args) {
        // ==== CREAR MINERALES ====
        Mineral nitrogeno = new Mineral("Nitrógeno", "Primario");
        Mineral fosforo = new Mineral("Fósforo", "Primario");
        Mineral potasio = new Mineral("Potasio", "Primario");
        Mineral azufre = new Mineral("Azufre", "Secundario");

        // ==== CREAR CEREALES ====
        Cereal maiz = new Cereal();
        maiz.setNombre("Maíz");
        maiz.setTipo(TipoCereal.GRUESO);
        maiz.getMineralesRequeridos().add(nitrogeno);
        maiz.getMineralesRequeridos().add(fosforo);

        Cereal trigo = new Cereal();
        trigo.setNombre("Trigo");
        trigo.setTipo(TipoCereal.FINO);
        trigo.getMineralesRequeridos().add(fosforo);
        trigo.getMineralesRequeridos().add(azufre);

        Cereal alfalfa = new Cereal();
        alfalfa.setNombre("Alfalfa");
        alfalfa.setTipo(TipoCereal.PASTURA);
        alfalfa.getMineralesRequeridos().add(nitrogeno);
        alfalfa.getMineralesRequeridos().add(potasio);

        // ==== CREAR LOTES ====
        Lote lote1 = new Lote("Lote 1");
        lote1.agregarMinerales(nitrogeno);
        lote1.agregarMinerales(fosforo);
        lote1.agregarMinerales(potasio);

        Lote lote2 = new Lote("Lote 2");
        lote2.agregarMinerales(fosforo);
        lote2.agregarMinerales(azufre);

        Lote lote3 = new Lote("Lote 3");
        lote3.agregarMinerales(nitrogeno);
        lote3.agregarMinerales(potasio);

        // ==== PRUEBAS ====
        System.out.println("=== PRUEBAS DE SIEMBRA ===");
        System.out.println("¿Se puede sembrar maíz en lote 1? " + lote1.puedeSembrar(maiz));
        if (lote1.puedeSembrar(maiz)) lote1.getCereales().add(maiz);

        System.out.println("¿Se puede sembrar trigo en lote 1? " + lote1.puedeSembrar(trigo));
        if (lote1.puedeSembrar(trigo)) lote1.getCereales().add(trigo);

        System.out.println("¿Se puede sembrar trigo en lote 2? " + lote2.puedeSembrar(trigo));
        if (lote2.puedeSembrar(trigo)) lote2.getCereales().add(trigo);

        System.out.println("¿Se puede sembrar alfalfa en lote 3? " + lote3.puedeSembrar(alfalfa));
        if (lote3.puedeSembrar(alfalfa)) lote3.getCereales().add(alfalfa);

        System.out.println("¿Se puede volver a sembrar alfalfa en lote 3? " + lote3.puedeSembrar(alfalfa));

        // ==== IMPRIMIR INFO DE LOTES ====
        System.out.println("\n=== INFORMACIÓN DE LOTES ===");
        imprimirLote(lote1);
        imprimirLote(lote2);
        imprimirLote(lote3);
    }

    private static void imprimirLote(Lote lote) {
        System.out.println("Lote: " + lote.getNombre());
        System.out.print(" - Minerales: ");
        lote.getMinerales().forEach(m -> System.out.print(m.getNombre() + " (" + m.getTipo() + ") "));
        System.out.println();

        if (lote.getCereales().isEmpty()) {
            System.out.println(" - Cereales sembrados: Ninguno");
        } else {
            System.out.print(" - Cereales sembrados: ");
            lote.getCereales().forEach(c -> System.out.print(c.getNombre() + " (" + c.getTipo() + ") "));
            System.out.println();
        }
        System.out.println();
    }
}
