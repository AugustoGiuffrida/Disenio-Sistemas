package Especie;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public abstract class Especie {
    private String nombreCientifico;
    private String nombreVulgar;

    public Especie(String nc, String nv) {
        this.nombreCientifico = nc;
        this.nombreVulgar = nv;
    }
}

