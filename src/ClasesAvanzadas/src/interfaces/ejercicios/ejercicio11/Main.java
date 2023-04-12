package interfaces.ejercicios.ejercicio11;

public class Main {
    public static void main(String[] args) {
        Ejercicio11 ejemplo = new Ejercicio11();
        ejemplo.a = 12;
        System.out.println(ejemplo.esMayor(24));
        System.out.println(ejemplo.esMenor(15));
        System.out.println(ejemplo.esIgual(33));
    }
}
