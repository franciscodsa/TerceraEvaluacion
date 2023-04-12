package figuras;

public class Punto {
    //ATRIBUTOS
    double x;
    double y;

    //CONSTRUCTOR

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
