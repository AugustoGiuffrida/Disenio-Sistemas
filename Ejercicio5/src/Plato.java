import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Plato {
    private String nombre;

    public Plato(String nombre){
        this.nombre = nombre;
    }
}
