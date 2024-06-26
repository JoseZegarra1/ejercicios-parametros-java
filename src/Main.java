import ParametrosEnteros.*;
import ParametrosBooleanos.*;
import ParametrosTexto.*;

public class Main {
    public static void main(String[] args) {
        // Ejemplos de uso de los métodos
        EjercicioMetodo1PE metodo1 = new EjercicioMetodo1PE();
        System.out.println("Suma: " + metodo1.sumar(5, 3));

        EjercicioMetodo2PE metodo2 = new EjercicioMetodo2PE();
        System.out.println("Multiplicación: " + metodo2.multiplicar(4, 6));

        EjercicioMetodo3PE metodo3 = new EjercicioMetodo3PE();
        System.out.println("MCD: " + metodo3.mcd(24, 36));

        EjercicioMetodo4PE metodo4 = new EjercicioMetodo4PE();
        System.out.println("Potencia: " + metodo4.potencia(2, 5));

        EjercicioMetodo5PE metodo5 = new EjercicioMetodo5PE();
        System.out.println("¿Es primo?: " + metodo5.esPrimo(17));

        EjercicioMetodo1PB metodo1PB = new EjercicioMetodo1PB();
        System.out.println("AND: " + metodo1PB.operacionAND(true, false));

        EjercicioMetodo2PB metodo2PB = new EjercicioMetodo2PB();
        System.out.println("OR: " + metodo2PB.operacionOR(true, false));

        EjercicioMetodo3PB metodo3PB = new EjercicioMetodo3PB();
        System.out.println("NOT: " + metodo3PB.operacionNOT(true));

        EjercicioMetodo4PB metodo4PB = new EjercicioMetodo4PB();
        System.out.println("XOR: " + metodo4PB.operacionXOR(true, false));

        EjercicioMetodo5PB metodo5PB = new EjercicioMetodo5PB();
        System.out.println("¿Es verdadero?: " + metodo5PB.esVerdadero(true));

        EjercicioMetodo1PT metodo1PT = new EjercicioMetodo1PT();
        System.out.println("Concatenación: " + metodo1PT.concatenar("Hola ", "mundo"));

        EjercicioMetodo2PT metodo2PT = new EjercicioMetodo2PT();
        System.out.println("Longitud: " + metodo2PT.longitud("OpenAI"));

        EjercicioMetodo3PT metodo3PT = new EjercicioMetodo3PT();
        System.out.println("Mayúsculas: " + metodo3PT.aMayusculas("java"));

        EjercicioMetodo4PT metodo4PT = new EjercicioMetodo4PT();
        System.out.println("¿Contiene subcadena?: " + metodo4PT.contieneSubcadena("Hola mundo", "mundo"));

        EjercicioMetodo5PT metodo5PT = new EjercicioMetodo5PT();
        System.out.println("Número de palabras: " + metodo5PT.contarPalabras("Esta es una cadena de texto"));

    }
}
