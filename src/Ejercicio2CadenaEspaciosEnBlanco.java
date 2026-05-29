import java.util.Scanner;

public class Ejercicio2CadenaEspaciosEnBlanco {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String cadena;

        System.out.println("Ingrese una frase: ");
        cadena = teclado.nextLine();

        cadena = cadena.replace(" ", "");

        System.out.println("Frase sin espacios: " + cadena);

        teclado.close();

    }
}
