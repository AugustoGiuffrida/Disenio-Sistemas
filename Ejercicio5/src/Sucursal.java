import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Sucursal {
    private String direccion;

    public Sucursal(String direccion){
        this.direccion = direccion;
    }
}
