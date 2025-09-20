import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class Restaurante {
    private String nombre;
    private List<Sucursal> sucursales = new ArrayList<>();
    private List<Plato> platos = new ArrayList<>();

    public Restaurante(String nombre){
        this.nombre = nombre;
    }

    public void agregarSucursal(String direccion){
        sucursales.add(new Sucursal(direccion));
    }

    public void agregarPlatos(String nombre){
        platos.add(new Plato(nombre));
    }
}
