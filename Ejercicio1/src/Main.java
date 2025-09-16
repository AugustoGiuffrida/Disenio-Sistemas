import Figuras.Elipse.Circulo;
import Figuras.Figura;
import Figuras.Lado.Lado;
import Figuras.Lado.Punto;
import Figuras.Poligono.Cuadrilatero.Cuadrado;
import Figuras.Poligono.Cuadrilatero.Rectangulo;
import Figuras.Poligono.Triangulo;

public class Main {
    public static void main(String[] args) {
        // --- Crear puntos ---
        Punto p1 = new Punto(0, 0);
        Punto p2 = new Punto(4, 0);
        Punto p3 = new Punto(4, 3);
        Punto p4 = new Punto(0, 3);

        // --- Crear lados ---
        Lado lado1 = new Lado(p1, p2);
        Lado lado2 = new Lado(p2, p3);
        Lado lado3 = new Lado(p3, p4);
        Lado lado4 = new Lado(p4, p1);

        // --- Crear un Rectángulo ---
        Rectangulo rectangulo = new Rectangulo(4, 3);
        rectangulo.agregarLado(lado1);
        rectangulo.agregarLado(lado2);
        rectangulo.agregarLado(lado3);
        rectangulo.agregarLado(lado4);

        System.out.println("Rectángulo creado:");
        System.out.println("Base: " + rectangulo.getBase() + ", Altura: " + rectangulo.getAltura());
        System.out.println("Número de lados: " + rectangulo.getNroLados());
        for (int i = 0; i < rectangulo.getLados().size(); i++) {
            Lado l = rectangulo.getLados().get(i);
            System.out.println("Lado " + (i+1) + " desde (" + l.getInicio().getX() + "," + l.getInicio().getY() +
                    ") hasta (" + l.getFin().getX() + "," + l.getFin().getY() + ")");
        }

        // --- Crear un Cuadrado ---
        Cuadrado cuadrado = new Cuadrado(5,5);
        Punto cp1 = new Punto(0,0);
        Punto cp2 = new Punto(5,0);
        Punto cp3 = new Punto(5,5);
        Punto cp4 = new Punto(0,5);
        cuadrado.agregarLado(new Lado(cp1, cp2));
        cuadrado.agregarLado(new Lado(cp2, cp3));
        cuadrado.agregarLado(new Lado(cp3, cp4));
        cuadrado.agregarLado(new Lado(cp4, cp1));

        System.out.println("\nCuadrado creado:");
        System.out.println("Lado: " + cuadrado.getBase());
        System.out.println("Número de lados: " + cuadrado.getNroLados());

        // --- Crear un Triángulo ---
        Triangulo triangulo = new Triangulo();
        Punto tp1 = new Punto(0,0);
        Punto tp2 = new Punto(3,0);
        Punto tp3 = new Punto(1,2);
        triangulo.agregarLado(new Lado(tp1, tp2));
        triangulo.agregarLado(new Lado(tp2, tp3));
        triangulo.agregarLado(new Lado(tp3, tp1));

        System.out.println("\nTriángulo creado:");
        System.out.println("Número de lados: " + triangulo.getNroLados());
        for (int i = 0; i < triangulo.getLados().size(); i++) {
            Lado l = triangulo.getLados().get(i);
            System.out.println("Lado " + (i+1) + " desde (" + l.getInicio().getX() + "," + l.getInicio().getY() +
                    ") hasta (" + l.getFin().getX() + "," + l.getFin().getY() + ")");
        }

        // --- Crear un Círculo ---
        Circulo circulo = new Circulo(5);
        System.out.println("\nCírculo creado:");
        System.out.println("Radio: " + circulo.getRadio());

        // --- Crear una Figura compuesta ---
        Figura figura = new Figura("Mi figura") {};
        figura.agregarPoligono(rectangulo);
        figura.agregarPoligono(cuadrado);
        figura.agregarPoligono(triangulo);
        figura.agregarElipse(circulo);

        System.out.println("\nFigura compuesta: " + figura.getNombre());
        System.out.println("Cantidad de polígonos: " + figura.getPoligonos().size());
        System.out.println("Cantidad de elipses: " + figura.getElipses().size());
    }
}
