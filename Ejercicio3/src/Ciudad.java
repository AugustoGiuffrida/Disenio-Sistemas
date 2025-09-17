
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Map;

@NoArgsConstructor
@Getter
@Setter
public class Ciudad {
    private String nombre;
    private double gastosMantenimiento;
    private Map<String, Double> impuestos = new HashMap<>();

    public double getRecaudacionTotal(){
        double recaudacion = 0;
        for(Double impuesto : impuestos.values()){
            recaudacion =+impuesto;
        }
        return recaudacion;
    }

    public boolean tieneDeficit(){
      return gastosMantenimiento > getRecaudacionTotal();
    }
}


