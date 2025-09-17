import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Ciudad {
    private String nombre;

    public Ciudad(String nombre){
        this.nombre = nombre;
    }
}
