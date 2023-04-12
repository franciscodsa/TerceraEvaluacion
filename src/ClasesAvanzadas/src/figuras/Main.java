package figuras;

public class Main {
    public static void main(String[] args) {
        /*Punto p1 = new Punto(2, 2);
        Punto p2 = new Punto(1, 5);
        Punto p3 = new Punto(-2, 0);

        Triangulo triangulo = new Triangulo(p1, p2, p3);
        System.out.println(triangulo.calcularArea());
        System.out.println(triangulo.calcularPerimetro());
        */
        Punto p1 = new Punto(-2, 4);
        Punto p2 = new Punto(-2, 12);
        Punto p3 = new Punto(4, 12);
        Punto p4 = new Punto(4, 4);

        Rectangulo rectangulo = new Rectangulo(p1, p2, p3, p4);
        System.out.println(rectangulo.calcularArea());
        System.out.println(rectangulo.calcularPerimetro());
    }
}