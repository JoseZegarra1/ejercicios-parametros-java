package ParametrosEnteros;

public class EjercicioMetodo3PE {
    // Método que calcula el máximo común divisor de dos números enteros
    public int mcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
