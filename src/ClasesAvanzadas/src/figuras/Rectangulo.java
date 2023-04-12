package figuras;

import java.util.ArrayList;

public class Rectangulo extends Figura2D {
    //ATRIBUTOS
    Punto p1;
    Punto p2;
    Punto p3;
    Punto p4;

    //CONSTRUCTOR

    public Rectangulo(Punto p1, Punto p2, Punto p3, Punto p4) {
        super(4);
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }

    public Rectangulo(ArrayList<Punto> puntos) {
        super(4);
        this.p1 = puntos.get(0);
        this.p2 = puntos.get(1);
        this.p3 = puntos.get(2);
        this.p4 = puntos.get(3);
    }

    //FUNCIONES
    public String nombreFigura() {
        return "rectangulo";
    }

    @Override
    protected double calcularArea() {
        return base() * altura();
    }

    @Override
    protected double calcularPerimetro() {
        double perimetro = 0;
        ArrayList<Linea> lineas = crearLineas();
        for (Linea l : lineas) perimetro += l.calcularLongitud();
        return perimetro;
    }

    protected ArrayList<Linea> crearLineas() {
        ArrayList<Linea> lineas = new ArrayList<>(lados - 1);

        Linea l1 = new Linea(p1, p2);
        lineas.add(l1);

        Linea l2 = new Linea(p2, p3);
        lineas.add(l2);

        Linea l3 = new Linea(p3, p4);
        lineas.add(l3);

        Linea l4 = new Linea(p4, p1);
        lineas.add(l4);

        return lineas;
    }

    private double altura() {
        ArrayList<Linea> lineas = crearLineas();
        return lineas.get(0).calcularLongitud();
    }

    private double base() {
        ArrayList<Linea> lineas = crearLineas();
        return lineas.get(3).calcularLongitud();
    }

    @Override
    public String toString() {
        return nombreFigura() + " de base = " + base() + " y de altura = " +altura();
    }
}
