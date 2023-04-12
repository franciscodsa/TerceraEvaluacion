package interfaces.ejercicios.ejercicio11;

public class Ejercicio11 implements Relaciones {
    int a;


    @Override
    public boolean esMayor(Object b) {
        if (b instanceof Integer){
            return a > (int) b;
        }
        return false;
    }

    @Override
    public boolean esMenor(Object b) {
        if (b instanceof Integer){
            return a < (int) b;
        }
        return false;
    }

    @Override
    public boolean esIgual(Object b) {
        if (b instanceof Integer){
            return a == (int) b;
        }
        return false;
    }
}
