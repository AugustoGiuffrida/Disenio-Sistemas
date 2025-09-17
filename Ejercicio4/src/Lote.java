import enums.TipoCereal;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@NoArgsConstructor
@Getter
@Setter
public class Lote {
    private String nombre;
    private boolean esEspecial;
    private List<Cereal> cereales = new ArrayList<>();
    private Set<Mineral> minerales = new HashSet<>();

    public Lote(String nombre){
        this.nombre = nombre;
    }

    public void agregarMinerales(Mineral mineral){
        minerales.add(mineral);
    }

    public boolean puedeSembrar(Cereal cereal){
        boolean cumpleMinerales = minerales.containsAll(cereal.getMineralesRequeridos());
        boolean yaTienePastura = cereales.stream().anyMatch(c-> c.getTipo() == TipoCereal.PASTURA);

        if (cereal.getTipo() == TipoCereal.PASTURA && yaTienePastura){
            return false;
        }

        return cumpleMinerales ;
    }
}
