package figuras;

public class Linea {
    //ATRIBUTOS
    //int dimensiones;
    Punto puntoInicio;
    Punto puntoFin;

    //CONSTRUCTOR

    public Linea(Punto puntoInicio, Punto puntoFin) {
        this.puntoInicio = puntoInicio;
        this.puntoFin = puntoFin;
    }

    //FUNCIONES
    public double calcularLongitud() {
        double ecuacionX = Math.pow(puntoInicio.x - puntoFin.x, 2);
        double ecuacionY = Math.pow(puntoInicio.y - puntoFin.y, 2);
        return Math.sqrt(ecuacionX + ecuacionY);
    }

    @Override
    public String toString() {
        return "(" + puntoInicio.x + ", " + puntoInicio.y + ") - (" + puntoFin.x + ", " + puntoFin.y + ")";
    }

   /* public void dibujarLinea() {
        dimensiones = (int) calcularLongitud();
    }*/
}
