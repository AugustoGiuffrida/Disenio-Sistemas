import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Mineral {
    private String nombre;
    private String tipo;

    public Mineral(String nombre, String tipo){
        this.nombre = nombre;
        this.tipo = tipo;
    }
}
