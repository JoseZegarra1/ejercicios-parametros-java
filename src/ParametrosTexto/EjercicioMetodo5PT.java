package ParametrosTexto;

public class EjercicioMetodo5PT {
    // Método que cuenta el número de palabras en una cadena de texto
    public int contarPalabras(String texto) {
        String[] palabras = texto.split("\\s+");
        return palabras.length;
    }
}
