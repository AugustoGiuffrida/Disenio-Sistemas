import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Sucursales {
    private String direccion;

    public Sucursales(String direccion){
        this.direccion = direccion;
    }
}
