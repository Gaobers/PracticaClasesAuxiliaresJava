import java.util.Scanner;

public class Ejercicio1CantidadPalabrasFrase {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String frase;

        System.out.println("Ingrese una frase: ");
        frase = teclado.nextLine();

        String[] palabras = frase.split(" ");

        System.out.println("La frase contiene " + palabras.length + " palabras");
    }
}