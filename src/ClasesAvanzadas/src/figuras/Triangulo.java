package figuras;

import java.util.ArrayList;

public class Triangulo extends Figura2D {
    //ATRIBUTOS
    Punto p1;
    Punto p2;
    Punto p3;

    //CONTRUCTOR

    public Triangulo(Punto p1, Punto p2, Punto p3) {
        super(3);
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public Triangulo(ArrayList<Punto> puntos) {
        super(3);
        this.p1 = puntos.get(0);
        this.p2 = puntos.get(1);
        this.p3 = puntos.get(2);
    }

    //FUNCIONES

    @Override
    protected double calcularPerimetro() {
        if (isosceles()) {
            return pIsosceles();
        } else if (equilatero()) {
            return pEquilatero();
        } else {
            return pRectangulo();
        }
    }

    private double pRectangulo() {
        return a() + base() + c();
    }

    private double pEquilatero() {
        return 3 * a();
    }

    private double pIsosceles() {
        return 2 * a() + base();
    }

    @Override
    protected double calcularArea() {
        if (isosceles()) {
            return areaIsosceles();
        } else if (equilatero()) {
            return areaEquilatero();
        } else {
            return areaRectangular();
        }
    }

    private double areaRectangular() {
        return (base() * a()) / 2;
    }

    private double areaEquilatero() {
        return (Math.sqrt(3) / 4) * Math.pow(a(), 2);
    }

    private double areaIsosceles() {
        return (base() * Math.sqrt(Math.pow(a(), 2) - (Math.pow(base(), 2)) / 4)) / 2;
    }

    protected double altura() {
        if (equilatero()) {
            return hEquilatero();
        } else if (isosceles()) {
            return hIsosceles();
        } else {
            return hRectangulo();
        }
    }

    private double hRectangulo() {
        return (a() * base()) / c();
    }

    private double hIsosceles() {
        return Math.sqrt(Math.pow(a(), 2) - (Math.pow(base(), 2) / 4));
    }

    private double hEquilatero() {
        return Math.sqrt(3 * a()) / 2;
    }

    private boolean equilatero() {
        return a() == base() && a() == c();
    }
    private boolean isosceles() {
        return a() == c() && a() != base();
    }

    private double a() {
        ArrayList<Linea> lineas = crearLineas();
        return lineas.get(0).calcularLongitud();
    }

    private double c() {
        ArrayList<Linea> lineas = crearLineas();
        return lineas.get(1).calcularLongitud();
    }

    private double base() {
        ArrayList<Linea> lineas = crearLineas();
        return lineas.get(2).calcularLongitud();
    }
    @Override
    protected ArrayList<Linea> crearLineas() {
        ArrayList<Linea> lineas = new ArrayList<>(lados - 1);

        Linea l1 = new Linea(p1, p2);
        lineas.add(l1);

        Linea l2 = new Linea(p2, p3);
        lineas.add(l2);

        Linea l3 = new Linea(p3, p1);
        lineas.add(l3);
        return lineas;
    }

    @Override
    public String nombreFigura() {
        return "triangulo";
    }

    @Override
    public String toString() {
        return nombreFigura() + " base = " + base() + " y altura = " + altura();
    }
}
