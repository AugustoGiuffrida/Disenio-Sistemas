package competidores;

import enums.ModoParticipacion;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class Equipo implements Competidor {
    private String codigo;
    private String entrenador;
    private List<Esquiador> miembros = new ArrayList<>();

    public Equipo(String codigo, String entrenador){
        this.codigo = codigo;
        this.entrenador = entrenador;
        this.miembros = new ArrayList<>();
    }

    public int getCantidad() {
        return miembros.size();
    }

    public void agregarMiembro(Esquiador esquiador){
        if(esquiador == null) throw new IllegalArgumentException("Esquiador nulo");
        if(esquiador.getModo() != ModoParticipacion.EQUIPO)
            throw new IllegalArgumentException("El esquiador debe tener modo EQUIPO para pertenecer a un equipo.");
        miembros.add(esquiador);
    }
}
