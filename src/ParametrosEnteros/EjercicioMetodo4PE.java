package ParametrosEnteros;

public class EjercicioMetodo4PE {
    // Método que calcula la potencia de un número entero
    public int potencia(int base, int exponente) {
        int resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }
        return resultado;
    }
}
