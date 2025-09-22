package Especie;

import enums.Dieta;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Animal extends Especie {
    private Dieta dieta;
    private String periodoCelo;
    private List<Especie> come = new ArrayList<>();


    public Animal(String nombreCientifico, String nombreVulgar, Dieta dieta, String periodoCelo) {
        super(nombreCientifico, nombreVulgar);
        this.dieta = dieta;
        this.periodoCelo = periodoCelo;
    }
}
