package figuras;

import java.util.ArrayList;

abstract class Figura2D {
    //ATRIBUTOS
    int lados;

    //CONSTRUCTOR

    public Figura2D(int lados) {
        this.lados = lados;
    }

    //FUNCIONES
    public abstract String nombreFigura();

    protected abstract ArrayList<Linea> crearLineas();

    protected abstract double calcularPerimetro();

    protected abstract double calcularArea();
}
