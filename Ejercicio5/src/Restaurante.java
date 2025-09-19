import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Restaurante {
    private String nombre;

    public Restaurante(String nombre){
        this.nombre = nombre;
    }
}
