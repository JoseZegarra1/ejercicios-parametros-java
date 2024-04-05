package ParametrosEnteros;

public class EjercicioMetodo5PE {
    // Método que verifica si un número entero es primo
    public boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
