import Especie.Especie;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PresenciaEspecie {
    private Especie especie;
    private int numeroIndividuos;
}
