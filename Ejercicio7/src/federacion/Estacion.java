package federacion;

import lombok.*;
import pista.Pista;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class Estacion {
    private String codigo; // PK
    private String nombre;
    private String contacto;
    private String direccion;
    private String telefono;
    private double kmTotales;
    private int nroPistas;
    private List<Pista> pistas = new ArrayList<>();

    public Estacion(String codigo, String nombre, String contacto, String direccion,
                    String telefono, double kmTotales, int nroPistas){
        this.codigo = codigo;
        this.nombre = nombre;
        this.contacto = contacto;
        this.direccion = direccion;
        this.telefono = telefono;
        this.kmTotales = kmTotales;
        this.nroPistas = nroPistas;
        this.pistas = new ArrayList<>();
    }

    public void agregarPista(Pista p){
        for(Pista ex : pistas) {
            if(ex.getNumero() == p.getNumero()) throw new IllegalArgumentException("Ya existe pista con ese numero en la estacion.");
        }
        p.setEstacionCodigo(this.codigo);
        pistas.add(p);
    }
}